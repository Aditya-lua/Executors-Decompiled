; BN_CTX_end @ 00a03ea8
00a03ea8	cbz x0,0x00a03f30
00a03eac	ldr w8,[x0, #0x34]
00a03eb0	cbz w8,0x00a03ec0
00a03eb4	sub w8,w8,#0x1
00a03eb8	str w8,[x0, #0x34]
00a03ebc	ret
00a03ec0	ldr w8,[x0, #0x28]
00a03ec4	ldr x9,[x0, #0x20]
00a03ec8	sub w8,w8,#0x1
00a03ecc	str w8,[x0, #0x28]
00a03ed0	ldr w8,[x9, w8, UXTW #0x2]
00a03ed4	ldr w9,[x0, #0x30]
00a03ed8	subs w10,w9,w8
00a03edc	b.ls 0x00a03f28
00a03ee0	ldr w11,[x0, #0x18]
00a03ee4	sub w12,w11,w10
00a03ee8	str w12,[x0, #0x18]
00a03eec	cbz w10,0x00a03f28
00a03ef0	sub w10,w11,#0x1
00a03ef4	and w10,w10,#0xf
00a03ef8	sub w9,w8,w9
00a03efc	cbz w10,0x00a03f10
00a03f00	sub w10,w10,#0x1
00a03f04	adds w9,w9,#0x1
00a03f08	b.ne 0x00a03efc
00a03f0c	b 0x00a03f28
00a03f10	ldr x10,[x0, #0x8]
00a03f14	ldr x10,[x10, #0x180]
00a03f18	str x10,[x0, #0x8]
00a03f1c	orr w10,wzr,#0xf
00a03f20	adds w9,w9,#0x1
00a03f24	b.ne 0x00a03efc
00a03f28	str w8,[x0, #0x30]
00a03f2c	str wzr,[x0, #0x38]
00a03f30	ret
