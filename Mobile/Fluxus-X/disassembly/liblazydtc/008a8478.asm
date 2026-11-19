; FUN_008a8478 @ 008a8478
008a8478	stp x29,x30,[sp, #-0x50]!
008a847c	str x25,[sp, #0x10]
008a8480	stp x24,x23,[sp, #0x20]
008a8484	stp x22,x21,[sp, #0x30]
008a8488	stp x20,x19,[sp, #0x40]
008a848c	mov x29,sp
008a8490	ldp x9,x8,[x0, #0x8]
008a8494	mov x19,x0
008a8498	mov x23,x1
008a849c	cmp x9,x8
008a84a0	b.cs 0x008a84b4
008a84a4	ldr q0,[x23]
008a84a8	add x24,x9,#0x10
008a84ac	str q0,[x9]
008a84b0	b 0x008a8540
008a84b4	ldr x20,[x19]
008a84b8	sub x22,x9,x20
008a84bc	asr x25,x22,#0x4
008a84c0	add x9,x25,#0x1
008a84c4	lsr x10,x9,#0x3c
008a84c8	cbnz x10,0x008a855c
008a84cc	sub x21,x8,x20
008a84d0	orr x10,xzr,#0x7ffffffffffffff0
008a84d4	asr x8,x21,#0x3
008a84d8	cmp x8,x9
008a84dc	csel x8,x8,x9,hi
008a84e0	cmp x21,x10
008a84e4	mov x9,#0xfffffffffffffff
008a84e8	csel x8,x8,x9,cc
008a84ec	lsr x9,x8,#0x3c
008a84f0	cbnz x9,0x008a8560
008a84f4	lsl x24,x8,#0x4
008a84f8	mov x0,x24
008a84fc	bl 0x00c2fed0
008a8500	add x8,x0,x22
008a8504	ldr q0,[x23]
008a8508	mov x1,x20
008a850c	sub x23,x8,x25, LSL #0x4
008a8510	add x25,x0,x24
008a8514	mov x2,x22
008a8518	str q0,[x8]
008a851c	add x24,x8,#0x10
008a8520	mov x0,x23
008a8524	bl 0x00c2ffd0
008a8528	stp x23,x24,[x19]
008a852c	str x25,[x19, #0x10]
008a8530	cbz x20,0x008a8540
008a8534	mov x0,x20
008a8538	mov x1,x21
008a853c	bl 0x00c2fe80
008a8540	str x24,[x19, #0x8]
008a8544	ldp x20,x19,[sp, #0x40]
008a8548	ldr x25,[sp, #0x10]
008a854c	ldp x22,x21,[sp, #0x30]
008a8550	ldp x24,x23,[sp, #0x20]
008a8554	ldp x29,x30,[sp], #0x50
008a8558	ret
008a855c	bl 0x008a87b8
008a8560	bl 0x007fe1b8
