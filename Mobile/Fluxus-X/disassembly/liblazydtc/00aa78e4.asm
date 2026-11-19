; CRYPTO_ccm128_setiv @ 00aa78e4
00aa78e4	ldrb w9,[x0]
00aa78e8	orr w11,wzr,#0xe
00aa78ec	mov x8,x2
00aa78f0	and x10,x9,#0x7
00aa78f4	sub x2,x11,x10
00aa78f8	cmp x2,x8
00aa78fc	b.ls 0x00aa7908
00aa7900	mov w0,#0xffffffff
00aa7904	ret
00aa7908	and w8,w10,#0xff
00aa790c	cmp w8,#0x3
00aa7910	b.cc 0x00aa7938
00aa7914	lsr x8,x3,#0x38
00aa7918	lsr x10,x3,#0x30
00aa791c	lsr x11,x3,#0x28
00aa7920	lsr x12,x3,#0x20
00aa7924	strb w8,[x0, #0x8]
00aa7928	strb w10,[x0, #0x9]
00aa792c	strb w11,[x0, #0xa]
00aa7930	strb w12,[x0, #0xb]
00aa7934	b 0x00aa793c
00aa7938	str xzr,[x0, #0x8]
00aa793c	stp x29,x30,[sp, #-0x10]!
00aa7940	lsr x8,x3,#0x18
00aa7944	lsr x10,x3,#0x10
00aa7948	lsr x11,x3,#0x8
00aa794c	and w9,w9,#0xffffffbf
00aa7950	strb w3,[x0, #0xf]
00aa7954	strb w8,[x0, #0xc]
00aa7958	strb w10,[x0, #0xd]
00aa795c	strb w11,[x0, #0xe]
00aa7960	strb w9,[x0], #0x1
00aa7964	mov x29,sp
00aa7968	bl 0x00c2ffd0
00aa796c	mov w0,wzr
00aa7970	ldp x29,x30,[sp], #0x10
00aa7974	ret
