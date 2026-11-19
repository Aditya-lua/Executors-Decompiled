; ssl3_release_read_buffer @ 009cce94
009cce94	str x19,[sp, #-0x20]!
009cce98	stp x29,x30,[sp, #0x10]
009cce9c	ldrb w8,[x0, #0x9e8]
009ccea0	mov x19,x0
009ccea4	add x29,sp,#0x10
009ccea8	tbz w8,#0x1,0x009cceb8
009cceac	ldr x0,[x19, #0xc78]
009cceb0	ldr x1,[x19, #0xc88]
009cceb4	bl 0x00c34750
009cceb8	ldr x0,[x19, #0xc78]
009ccebc	adrp x1,0x2d7000
009ccec0	add x1,x1,#0xa7b
009ccec4	orr w2,wzr,#0xc0
009ccec8	bl 0x00c32310
009ccecc	movi v0.2D,#0x0
009cced0	mov w8,#0x1ca8
009cced4	str xzr,[x19, #0xc78]
009cced8	str q0,[x19,x8]
009ccedc	ldp x29,x30,[sp, #0x10]
009ccee0	mov w0,#0x1
009ccee4	ldr x19,[sp], #0x20
009ccee8	ret
