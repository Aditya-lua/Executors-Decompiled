; BIO_vprintf @ 009fd99c
009fd99c	stp x28,x19,[sp, #-0x20]!
009fd9a0	stp x29,x30,[sp, #0x10]
009fd9a4	add x29,sp,#0x10
009fd9a8	sub sp,sp,#0x850
009fd9ac	add x8,sp,#0x48
009fd9b0	mov w9,#0x800
009fd9b4	stp x9,x8,[sp, #0x38]
009fd9b8	str xzr,[sp, #0x30]
009fd9bc	ldr q0,[x2, #0x10]
009fd9c0	mov x5,x1
009fd9c4	mov x19,x0
009fd9c8	add x0,sp,#0x40
009fd9cc	str q0,[sp, #0x10]
009fd9d0	ldr q0,[x2]
009fd9d4	add x1,sp,#0x30
009fd9d8	add x2,sp,#0x38
009fd9dc	sub x3,x29,#0x18
009fd9e0	add x4,sp,#0x2c
009fd9e4	mov x6,sp
009fd9e8	str q0,[sp]
009fd9ec	bl 0x009fda6c
009fd9f0	ldr x1,[sp, #0x30]
009fd9f4	cbz w0,0x009fda28
009fd9f8	ldur w2,[x29, #-0x18]
009fd9fc	cbz x1,0x009fda48
009fda00	mov x0,x19
009fda04	bl 0x00c34240
009fda08	ldr x8,[sp, #0x30]
009fda0c	adrp x1,0x2af000
009fda10	mov w19,w0
009fda14	add x1,x1,#0xd26
009fda18	mov w2,#0x395
009fda1c	mov x0,x8
009fda20	bl 0x00c32310
009fda24	b 0x009fda58
009fda28	adrp x8,0x2af000
009fda2c	add x8,x8,#0xd26
009fda30	mov w2,#0x390
009fda34	mov x0,x1
009fda38	mov x1,x8
009fda3c	bl 0x00c32310
009fda40	mov w19,#0xffffffff
009fda44	b 0x009fda58
009fda48	add x1,sp,#0x48
009fda4c	mov x0,x19
009fda50	bl 0x00c34240
009fda54	mov w19,w0
009fda58	mov w0,w19
009fda5c	add sp,sp,#0x850
009fda60	ldp x29,x30,[sp, #0x10]
009fda64	ldp x28,x19,[sp], #0x20
009fda68	ret
