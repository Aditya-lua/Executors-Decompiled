; BN_GF2m_mod_div_arr @ 00a2d1cc
00a2d1cc	stp x24,x23,[sp, #-0x40]!
00a2d1d0	stp x22,x21,[sp, #0x10]
00a2d1d4	mov x21,x0
00a2d1d8	mov x0,x4
00a2d1dc	stp x20,x19,[sp, #0x20]
00a2d1e0	stp x29,x30,[sp, #0x30]
00a2d1e4	add x29,sp,#0x30
00a2d1e8	mov x19,x4
00a2d1ec	mov x24,x3
00a2d1f0	mov x23,x2
00a2d1f4	mov x20,x1
00a2d1f8	bl 0x00c38a90
00a2d1fc	mov x0,x19
00a2d200	bl 0x00c38a40
00a2d204	cbz x0,0x00a2d288
00a2d208	mov x22,x0
00a2d20c	bl 0x00c38e00
00a2d210	ldr w1,[x24]
00a2d214	cmn w1,#0x1
00a2d218	b.eq 0x00a2d238
00a2d21c	add x24,x24,#0x4
00a2d220	mov x0,x22
00a2d224	bl 0x00c38db0
00a2d228	cbz w0,0x00a2d288
00a2d22c	ldr w1,[x24], #0x4
00a2d230	cmn w1,#0x1
00a2d234	b.ne 0x00a2d220
00a2d238	mov x0,x19
00a2d23c	bl 0x00c38a90
00a2d240	mov x0,x19
00a2d244	bl 0x00c38a40
00a2d248	cbz x0,0x00a2d290
00a2d24c	mov x1,x23
00a2d250	mov x2,x22
00a2d254	mov x3,x19
00a2d258	mov x24,x0
00a2d25c	bl 0x00a2caa4
00a2d260	cbz w0,0x00a2d290
00a2d264	mov x0,x21
00a2d268	mov x1,x20
00a2d26c	mov x2,x24
00a2d270	mov x3,x22
00a2d274	mov x4,x19
00a2d278	bl 0x00a2c73c
00a2d27c	cmp w0,#0x0
00a2d280	cset w20,ne
00a2d284	b 0x00a2d294
00a2d288	mov w20,wzr
00a2d28c	b 0x00a2d29c
00a2d290	mov w20,wzr
00a2d294	mov x0,x19
00a2d298	bl 0x00c38a20
00a2d29c	mov x0,x19
00a2d2a0	bl 0x00c38a20
00a2d2a4	mov w0,w20
00a2d2a8	ldp x29,x30,[sp, #0x30]
00a2d2ac	ldp x20,x19,[sp, #0x20]
00a2d2b0	ldp x22,x21,[sp, #0x10]
00a2d2b4	ldp x24,x23,[sp], #0x40
00a2d2b8	ret
