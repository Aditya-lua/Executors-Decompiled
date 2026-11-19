; FUN_008af238 @ 008af238
008af238	stp x29,x30,[sp, #-0x30]!
008af23c	str x21,[sp, #0x10]
008af240	stp x20,x19,[sp, #0x20]
008af244	mov x29,sp
008af248	mov w21,w2
008af24c	mov w19,w1
008af250	mov x20,x0
008af254	bl 0x008ab0e0
008af258	cmp w0,#0x1
008af25c	b.lt 0x008af28c
008af260	mov x0,x20
008af264	mov w1,w19
008af268	bl 0x008ab0e0
008af26c	cmp w0,#0x1
008af270	b.ne 0x008af2a0
008af274	mov x0,x20
008af278	mov w1,w19
008af27c	ldp x20,x19,[sp, #0x20]
008af280	ldr x21,[sp, #0x10]
008af284	ldp x29,x30,[sp], #0x30
008af288	b 0x008ab7b0
008af28c	mov w0,w21
008af290	ldp x20,x19,[sp, #0x20]
008af294	ldr x21,[sp, #0x10]
008af298	ldp x29,x30,[sp], #0x30
008af29c	ret
008af2a0	mov x0,x20
008af2a4	mov w1,w19
008af2a8	mov w2,#0x1
008af2ac	bl 0x008af05c
