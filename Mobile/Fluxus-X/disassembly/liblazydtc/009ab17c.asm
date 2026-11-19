; ssl3_cleanup_key_block @ 009ab17c
009ab17c	str x19,[sp, #-0x20]!
009ab180	stp x29,x30,[sp, #0x10]
009ab184	mov x19,x0
009ab188	ldr x0,[x0, #0x318]
009ab18c	ldr x1,[x19, #0x310]
009ab190	adrp x2,0x2a3000
009ab194	add x2,x2,#0xb34
009ab198	mov w3,#0x13a
009ab19c	add x29,sp,#0x10
009ab1a0	bl 0x00c345e0
009ab1a4	str xzr,[x19, #0x318]
009ab1a8	str xzr,[x19, #0x310]
009ab1ac	ldp x29,x30,[sp, #0x10]
009ab1b0	ldr x19,[sp], #0x20
009ab1b4	ret
