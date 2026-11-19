; ossl_method_store_cache_get @ 00ac4b8c
00ac4b8c	sub sp,sp,#0x70
00ac4b90	stp x24,x23,[sp, #0x30]
00ac4b94	stp x22,x21,[sp, #0x40]
00ac4b98	mov w24,w2
00ac4b9c	mov w21,wzr
00ac4ba0	stp x20,x19,[sp, #0x50]
00ac4ba4	stp x29,x30,[sp, #0x60]
00ac4ba8	add x29,sp,#0x60
00ac4bac	cbz x0,0x00ac4c30
00ac4bb0	cmp w24,#0x1
00ac4bb4	b.lt 0x00ac4c30
00ac4bb8	mov x22,x3
00ac4bbc	cbz x3,0x00ac4c30
00ac4bc0	mov x19,x0
00ac4bc4	ldr x0,[x0, #0x10]
00ac4bc8	mov x20,x4
00ac4bcc	mov x23,x1
00ac4bd0	bl 0x00c35680
00ac4bd4	cbz w0,0x00ac4c1c
00ac4bd8	ldr x0,[x19, #0x8]
00ac4bdc	sxtw x1,w24
00ac4be0	bl 0x00c3ec70
00ac4be4	cbz x0,0x00ac4c24
00ac4be8	stp x23,x22,[sp]
00ac4bec	ldr x0,[x0, #0x10]
00ac4bf0	mov x1,sp
00ac4bf4	bl 0x00c34de0
00ac4bf8	mov x21,x0
00ac4bfc	cbz x0,0x00ac4c28
00ac4c00	ldp x0,x8,[x21, #0x10]
00ac4c04	blr x8
00ac4c08	cbz w0,0x00ac4c24
00ac4c0c	ldr x8,[x21, #0x10]
00ac4c10	mov w21,#0x1
00ac4c14	str x8,[x20]
00ac4c18	b 0x00ac4c28
00ac4c1c	mov w21,wzr
00ac4c20	b 0x00ac4c30
00ac4c24	mov w21,wzr
00ac4c28	ldr x0,[x19, #0x10]
00ac4c2c	bl 0x00c35690
00ac4c30	mov w0,w21
00ac4c34	ldp x29,x30,[sp, #0x60]
00ac4c38	ldp x20,x19,[sp, #0x50]
00ac4c3c	ldp x22,x21,[sp, #0x40]
00ac4c40	ldp x24,x23,[sp, #0x30]
00ac4c44	add sp,sp,#0x70
00ac4c48	ret
