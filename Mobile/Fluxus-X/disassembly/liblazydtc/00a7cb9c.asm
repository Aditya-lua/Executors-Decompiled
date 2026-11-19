; ossl_ffc_named_group_set @ 00a7cb9c
00a7cb9c	stp x20,x19,[sp, #-0x20]!
00a7cba0	mov x19,x0
00a7cba4	mov w0,wzr
00a7cba8	stp x29,x30,[sp, #0x10]
00a7cbac	add x29,sp,#0x10
00a7cbb0	cbz x19,0x00a7cbdc
00a7cbb4	mov x20,x1
00a7cbb8	cbz x1,0x00a7cbdc
00a7cbbc	ldp x1,x2,[x20, #0x18]
00a7cbc0	ldr x3,[x20, #0x28]
00a7cbc4	mov x0,x19
00a7cbc8	bl 0x00c3a060
00a7cbcc	ldr w8,[x20, #0x10]
00a7cbd0	mov w0,#0x1
00a7cbd4	str wzr,[x19, #0x34]
00a7cbd8	str w8,[x19, #0x58]
00a7cbdc	ldp x29,x30,[sp, #0x10]
00a7cbe0	ldp x20,x19,[sp], #0x20
00a7cbe4	ret
