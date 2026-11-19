; FUN_007fbc70 @ 007fbc70
007fbc70	stp x29,x30,[sp, #-0x20]!
007fbc74	stp x20,x19,[sp, #0x10]
007fbc78	mov x29,sp
007fbc7c	mov x19,x0
007fbc80	ldr x0,[x0, #0x10]
007fbc84	cbz x0,0x007fbc9c
007fbc88	ldr x20,[x0]
007fbc8c	mov w1,#0x18
007fbc90	bl 0x00c2fe80
007fbc94	mov x0,x20
007fbc98	cbnz x20,0x007fbc88
007fbc9c	ldr x0,[x19]
007fbca0	str xzr,[x19]
007fbca4	cbz x0,0x007fbcbc
007fbca8	ldr x8,[x19, #0x8]
007fbcac	lsl x1,x8,#0x3
007fbcb0	ldp x20,x19,[sp, #0x10]
007fbcb4	ldp x29,x30,[sp], #0x20
007fbcb8	b 0x00c2fe80
007fbcbc	ldp x20,x19,[sp, #0x10]
007fbcc0	ldp x29,x30,[sp], #0x20
007fbcc4	ret
