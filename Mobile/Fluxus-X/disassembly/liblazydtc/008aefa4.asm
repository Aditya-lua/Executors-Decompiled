; FUN_008aefa4 @ 008aefa4
008aefa4	stp x29,x30,[sp, #-0x20]!
008aefa8	stp x20,x19,[sp, #0x10]
008aefac	mov x29,sp
008aefb0	mov w19,w1
008aefb4	mov x20,x0
008aefb8	bl 0x008ab8a4
008aefbc	cbz x0,0x008aefcc
008aefc0	ldp x20,x19,[sp, #0x10]
008aefc4	ldp x29,x30,[sp], #0x20
008aefc8	ret
008aefcc	mov x0,x20
008aefd0	mov w1,w19
008aefd4	mov w2,#0x5
008aefd8	bl 0x008af05c
