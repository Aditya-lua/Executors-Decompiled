; OCSP_resp_get0_signer @ 00ab2edc
00ab2edc	str x21,[sp, #-0x30]!
00ab2ee0	stp x20,x19,[sp, #0x10]
00ab2ee4	add x20,x0,#0x8
00ab2ee8	mov x19,x1
00ab2eec	mov x21,x0
00ab2ef0	mov x0,x2
00ab2ef4	mov x1,x20
00ab2ef8	stp x29,x30,[sp, #0x20]
00ab2efc	add x29,sp,#0x20
00ab2f00	bl 0x00ab30c0
00ab2f04	cbz x0,0x00ab2f10
00ab2f08	mov w8,#0x1
00ab2f0c	b 0x00ab2f24
00ab2f10	ldr x0,[x21, #0x48]
00ab2f14	mov x1,x20
00ab2f18	bl 0x00ab30c0
00ab2f1c	cmp x0,#0x0
00ab2f20	cset w8,ne
00ab2f24	str x0,[x19]
00ab2f28	ldp x29,x30,[sp, #0x20]
00ab2f2c	ldp x20,x19,[sp, #0x10]
00ab2f30	mov w0,w8
00ab2f34	ldr x21,[sp], #0x30
00ab2f38	ret
