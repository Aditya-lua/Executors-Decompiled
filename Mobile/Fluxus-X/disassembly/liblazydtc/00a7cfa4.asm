; ossl_ffc_params_cleanup @ 00a7cfa4
00a7cfa4	str x19,[sp, #-0x20]!
00a7cfa8	stp x29,x30,[sp, #0x10]
00a7cfac	mov x19,x0
00a7cfb0	ldr x0,[x0]
00a7cfb4	add x29,sp,#0x10
00a7cfb8	bl 0x00c36290
00a7cfbc	ldr x0,[x19, #0x8]
00a7cfc0	bl 0x00c36290
00a7cfc4	ldr x0,[x19, #0x10]
00a7cfc8	bl 0x00c36290
00a7cfcc	ldr x0,[x19, #0x18]
00a7cfd0	bl 0x00c36290
00a7cfd4	ldr x0,[x19, #0x20]
00a7cfd8	adrp x1,0x2a4000
00a7cfdc	add x1,x1,#0x111
00a7cfe0	mov w2,#0x22
00a7cfe4	bl 0x00c32310
00a7cfe8	orr w2,wzr,#0x60
00a7cfec	mov x0,x19
00a7cff0	mov w1,wzr
00a7cff4	bl 0x00c301c0
00a7cff8	mov w8,#0xffffffff
00a7cffc	orr w9,wzr,#0x3
00a7d000	str w8,[x19, #0x30]
00a7d004	str w8,[x19, #0x38]
00a7d008	str w9,[x19, #0x40]
00a7d00c	ldp x29,x30,[sp, #0x10]
00a7d010	ldr x19,[sp], #0x20
00a7d014	ret
