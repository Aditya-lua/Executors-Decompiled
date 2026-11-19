; BN_with_flags @ 00a02e80
00a02e80	ldr x8,[x1]
00a02e84	str x8,[x0]
00a02e88	ldr x8,[x1, #0x8]
00a02e8c	str x8,[x0, #0x8]
00a02e90	ldr w8,[x1, #0x10]
00a02e94	str w8,[x0, #0x10]
00a02e98	ldr w8,[x0, #0x14]
00a02e9c	ldr w9,[x1, #0x14]
00a02ea0	and w8,w8,#0x1
00a02ea4	and w9,w9,#0xfffffffc
00a02ea8	orr w8,w8,w2
00a02eac	orr w8,w8,w9
00a02eb0	orr w8,w8,#0x2
00a02eb4	str w8,[x0, #0x14]
00a02eb8	ret
