; conf_ssl_get @ 00a11b58
00a11b58	adrp x8,0xd21000
00a11b5c	ldr x8,[x8, #0x968]
00a11b60	orr w9,wzr,#0x18
00a11b64	madd x8,x0,x9,x8
00a11b68	ldr x9,[x8]
00a11b6c	str x9,[x1]
00a11b70	ldr x9,[x8, #0x10]
00a11b74	str x9,[x2]
00a11b78	ldr x0,[x8, #0x8]
00a11b7c	ret
