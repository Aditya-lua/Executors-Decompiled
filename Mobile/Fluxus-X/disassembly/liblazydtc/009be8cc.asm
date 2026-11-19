; SSL_SESSION_set1_hostname @ 009be8cc
009be8cc	stp x20,x19,[sp, #-0x20]!
009be8d0	stp x29,x30,[sp, #0x10]
009be8d4	mov x19,x0
009be8d8	ldr x0,[x0, #0x330]
009be8dc	mov x20,x1
009be8e0	adrp x1,0x2db000
009be8e4	add x1,x1,#0xb17
009be8e8	mov w2,#0x3ec
009be8ec	add x29,sp,#0x10
009be8f0	bl 0x00c32310
009be8f4	cbz x20,0x009be91c
009be8f8	adrp x1,0x2db000
009be8fc	add x1,x1,#0xb17
009be900	mov w2,#0x3f1
009be904	mov x0,x20
009be908	bl 0x00c34600
009be90c	cmp x0,#0x0
009be910	str x0,[x19, #0x330]
009be914	cset w0,ne
009be918	b 0x009be924
009be91c	str xzr,[x19, #0x330]
009be920	mov w0,#0x1
009be924	ldp x29,x30,[sp, #0x10]
009be928	ldp x20,x19,[sp], #0x20
009be92c	ret
