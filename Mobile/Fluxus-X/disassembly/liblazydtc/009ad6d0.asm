; SSL_add_store_cert_subjects_to_stack @ 009ad6d0
009ad6d0	str x21,[sp, #-0x30]!
009ad6d4	stp x20,x19,[sp, #0x10]
009ad6d8	mov x19,x1
009ad6dc	adrp x1,0x9ad000
009ad6e0	add x1,x1,#0x51c
009ad6e4	stp x29,x30,[sp, #0x20]
009ad6e8	add x29,sp,#0x20
009ad6ec	mov x20,x0
009ad6f0	bl 0x00c34df0
009ad6f4	mov x21,x0
009ad6f8	mov w2,#0x1
009ad6fc	mov x0,x20
009ad700	mov x1,x19
009ad704	bl 0x009ad72c
009ad708	mov w19,w0
009ad70c	mov x0,x20
009ad710	mov x1,x21
009ad714	bl 0x00c34df0
009ad718	mov w0,w19
009ad71c	ldp x29,x30,[sp, #0x20]
009ad720	ldp x20,x19,[sp, #0x10]
009ad724	ldr x21,[sp], #0x30
009ad728	ret
