; EC_KEY_METHOD_get_init @ 00a300ac
00a300ac	cbz x1,0x00a300b8
00a300b0	ldr x8,[x0, #0x10]
00a300b4	str x8,[x1]
00a300b8	cbz x2,0x00a300c4
00a300bc	ldr x8,[x0, #0x18]
00a300c0	str x8,[x2]
00a300c4	cbz x3,0x00a300d0
00a300c8	ldr x8,[x0, #0x20]
00a300cc	str x8,[x3]
00a300d0	cbz x4,0x00a300dc
00a300d4	ldr x8,[x0, #0x28]
00a300d8	str x8,[x4]
00a300dc	cbz x5,0x00a300e8
00a300e0	ldr x8,[x0, #0x30]
00a300e4	str x8,[x5]
00a300e8	cbz x6,0x00a300f4
00a300ec	ldr x8,[x0, #0x38]
00a300f0	str x8,[x6]
00a300f4	ret
