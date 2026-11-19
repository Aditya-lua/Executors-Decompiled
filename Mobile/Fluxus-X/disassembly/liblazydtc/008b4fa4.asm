; FUN_008b4fa4 @ 008b4fa4
008b4fa4	ldr x8,[x0, #0x30]
008b4fa8	cbz x8,0x008b5018
008b4fac	stp x29,x30,[sp, #-0x20]!
008b4fb0	stp x20,x19,[sp, #0x10]
008b4fb4	mov x29,sp
008b4fb8	mov x19,x0
008b4fbc	mov x20,x1
008b4fc0	mov x1,x8
008b4fc4	ldr x8,[x1, #0x8]
008b4fc8	cmp x8,x20
008b4fcc	b.cc 0x008b5010
008b4fd0	ldr x8,[x1, #0x20]
008b4fd4	mov x9,x1
008b4fd8	mov x0,x19
008b4fdc	str x8,[x19, #0x30]
008b4fe0	ldr x8,[x9, #0x10]!
008b4fe4	ldr x10,[x1, #0x18]
008b4fe8	str x8,[x10, #0x10]
008b4fec	ldr x10,[x1, #0x18]
008b4ff0	str x10,[x8, #0x18]
008b4ff4	ldr x8,[x1, #0x8]
008b4ff8	ldr q0,[x8]
008b4ffc	str x9,[x1, #0x8]
008b5000	str q0,[x9]
008b5004	bl 0x008b63c4
008b5008	ldr x1,[x19, #0x30]
008b500c	cbnz x1,0x008b4fc4
008b5010	ldp x20,x19,[sp, #0x10]
008b5014	ldp x29,x30,[sp], #0x20
008b5018	ret
