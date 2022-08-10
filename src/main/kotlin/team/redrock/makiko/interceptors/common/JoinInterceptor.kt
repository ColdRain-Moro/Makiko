package team.redrock.makiko.interceptors.common

import net.mamoe.mirai.message.data.MessageChain
import net.mamoe.mirai.message.data.buildMessageChain
import team.redrock.makiko.interceptors.AtMessageContainsInterceptor

/**
 * team.redrock.makiko.interceptors.common.JoinInterceptor
 * makiko
 *
 * @author 寒雨
 * @since 2022/8/9 13:53
 */
object JoinInterceptor : AtMessageContainsInterceptor("加入", "进", "报名") {
    override val reply: MessageChain = buildMessageChain {
        append(
            """
            就在开学后，红岩网校就会开启一年一度的招新工作，去红岩报道迎新点线下宣讲会可以了解更多哟！快让redrocker成为你最骄傲的自称，来红岩和卷卷一起进步吧~~
            点这里了解更多：https://sourl.cn/3LnuB5
        """.trimIndent()
        )
    }
}