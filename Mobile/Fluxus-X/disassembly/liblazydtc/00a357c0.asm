; ossl_ecdh_compute_key @ 00a357c0
00a357c0	ldr x8,[x3, #0x18]
00a357c4	ldr x8,[x8]
00a357c8	ldr x4,[x8, #0x170]
00a357cc	cbz x4,0x00a357d4
00a357d0	br x4
00a357d4	stp x29,x30,[sp, #-0x10]!
00a357d8	mov x29,sp
00a357dc	bl 0x00c342a0
00a357e0	adrp x0,0x2d1000
00a357e4	adrp x2,0x2b2000
00a357e8	add x0,x0,#0x86c
00a357ec	add x2,x2,#0x187
00a357f0	mov w1,#0x20
00a357f4	bl 0x00c342b0
00a357f8	mov w0,#0x10
00a357fc	mov w1,#0xa0
00a35800	mov x2,xzr
00a35804	bl 0x00c342c0
00a35808	mov w0,wzr
00a3580c	ldp x29,x30,[sp], #0x10
00a35810	ret
