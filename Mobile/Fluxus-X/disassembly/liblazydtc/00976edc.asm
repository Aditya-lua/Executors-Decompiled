; ix::HttpClient::log @ 00976edc
00976edc	ldr x8,[x2]
00976ee0	ldr x0,[x8, #0xb0]
00976ee4	cbz x0,0x00976ef4
00976ee8	ldr x8,[x0]
00976eec	ldr x2,[x8, #0x30]
00976ef0	br x2
00976ef4	ret
