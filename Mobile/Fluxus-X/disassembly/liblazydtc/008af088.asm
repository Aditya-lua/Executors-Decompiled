; FUN_008af088 @ 008af088
008af088	stp x29,x30,[sp, #-0x30]!
008af08c	str x21,[sp, #0x10]
008af090	stp x20,x19,[sp, #0x20]
008af094	mov x29,sp
008af098	mov w19,w2
008af09c	mov w20,w1
008af0a0	mov x21,x0
008af0a4	bl 0x008ab0e0
008af0a8	cmp w0,w19
008af0ac	b.ne 0x008af0c0
008af0b0	ldp x20,x19,[sp, #0x20]
008af0b4	ldr x21,[sp, #0x10]
008af0b8	ldp x29,x30,[sp], #0x30
008af0bc	ret
008af0c0	mov x0,x21
008af0c4	mov w1,w20
008af0c8	mov w2,w19
008af0cc	bl 0x008af05c
