; X509_get_extension_flags @ 00b02ff4
00b02ff4	str x19,[sp, #-0x20]!
00b02ff8	stp x29,x30,[sp, #0x10]
00b02ffc	add x29,sp,#0x10
00b03000	mov x19,x0
00b03004	bl 0x00b01d98
00b03008	ldr w0,[x19, #0xe8]
00b0300c	ldp x29,x30,[sp, #0x10]
00b03010	ldr x19,[sp], #0x20
00b03014	ret
