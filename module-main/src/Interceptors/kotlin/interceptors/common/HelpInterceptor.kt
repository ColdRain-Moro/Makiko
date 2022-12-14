package interceptors.common

import interceptors.AtMessageContainsInterceptor
import net.mamoe.mirai.message.data.buildMessageChain

/**
 * team.redrock.makiko.interceptors.common.HelpInterceptor
 * makiko
 *
 * @author 寒雨
 * @since 2022/8/9 12:03
 */
class HelpInterceptor : AtMessageContainsInterceptor("help") {

    override val reply = buildMessageChain {
        append("""
        有问题就找卷娘吧！试试问我如下问题吧：

        【提问清单】
        红岩网校介绍
        产品策划及运营部介绍
        视觉设计部介绍
        前端介绍
        后端介绍
        移动开发部介绍
        运维安全部介绍
        在红岩网校能学到什么
        如何加入红岩网校
        红岩网校成果
        """.trimIndent()
        )

    }
}