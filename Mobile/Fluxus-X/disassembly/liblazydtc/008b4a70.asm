; FUN_008b4a70 @ 008b4a70
008b4a70	stp x29,x30,[sp, #-0x20]!
008b4a74	str x19,[sp, #0x10]
008b4a78	mov x29,sp
008b4a7c	ldr x8,[x0, #0x68]
008b4a80	mov x19,x0
008b4a84	ldur q0,[x8, #-0x10]
008b4a88	str q0,[x8]
008b4a8c	ldr x8,[x0, #0x68]
008b4a90	ldr q0,[x1]
008b4a94	stur q0,[x8, #-0x10]
008b4a98	ldr x9,[x0, #0x48]
008b4a9c	ldr x8,[x0, #0x68]
008b4aa0	sub x9,x9,x8
008b4aa4	cmp x9,#0x10
008b4aa8	b.gt 0x008b4acc
008b4aac	ldr w8,[x19, #0x40]
008b4ab0	mov x0,x19
008b4ab4	mov w2,wzr
008b4ab8	lsl w9,w8,#0x1
008b4abc	cmp w8,#0x1
008b4ac0	csinc w1,w9,w8,ge
008b4ac4	bl 0x008b3fdc
008b4ac8	ldr x8,[x19, #0x68]
008b4acc	add x9,x8,#0x10
008b4ad0	sub x1,x8,#0x10
008b4ad4	mov x0,x19
008b4ad8	mov w2,#0x1
008b4adc	str x9,[x19, #0x68]
008b4ae0	ldr x19,[sp, #0x10]
008b4ae4	ldp x29,x30,[sp], #0x20
008b4ae8	b 0x008b4664
