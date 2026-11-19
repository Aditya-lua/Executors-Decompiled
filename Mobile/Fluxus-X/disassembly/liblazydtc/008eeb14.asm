; cpr::Session::SetVerifySsl @ 008eeb14
008eeb14	stp x20,x19,[sp, #-0x20]!
008eeb18	stp x29,x30,[sp, #0x10]
008eeb1c	add x29,sp,#0x10
008eeb20	ldr x8,[x0, #0x18]
008eeb24	mov x20,x0
008eeb28	ldrb w2,[x1]
008eeb2c	mov x19,x1
008eeb30	ldr x0,[x8]
008eeb34	mov w1,#0x40
008eeb38	bl 0x00c317c0
008eeb3c	ldr x8,[x20, #0x18]
008eeb40	ldrb w9,[x19]
008eeb44	ldp x29,x30,[sp, #0x10]
008eeb48	mov w1,#0x51
008eeb4c	ldr x0,[x8]
008eeb50	cmp w9,#0x0
008eeb54	mov w8,#0x2
008eeb58	csel x2,xzr,x8,eq
008eeb5c	ldp x20,x19,[sp], #0x20
008eeb60	b 0x00c317c0
