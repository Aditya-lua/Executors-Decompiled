; FUN_00c2c478 @ 00c2c478
00c2c478	paciasp
00c2c47c	sub sp,sp,#0x80
00c2c480	stp x29,x30,[sp, #0x50]
00c2c484	str x21,[sp, #0x60]
00c2c488	stp x20,x19,[sp, #0x70]
00c2c48c	add x29,sp,#0x50
00c2c490	ldr x8,[x0]
00c2c494	mov x20,x2
00c2c498	mov x19,x0
00c2c49c	mov w21,w1
00c2c4a0	ldr x8,[x8, #0x10]
00c2c4a4	blr x8
00c2c4a8	tbz w0,#0x0,0x00c2c548
00c2c4ac	ldr x8,[x19]
00c2c4b0	mov x0,x19
00c2c4b4	mov w1,w21
00c2c4b8	mov x2,x20
00c2c4bc	ldr x8,[x8, #0x20]
00c2c4c0	blr x8
00c2c4c4	cmn w21,#0x1
00c2c4c8	b.ne 0x00c2c52c
00c2c4cc	ldr x8,[x19]
00c2c4d0	add x1,sp,#0x8
00c2c4d4	mov x0,x19
00c2c4d8	ldr x8,[x8, #0x48]
00c2c4dc	blr x8
00c2c4e0	ldr x8,[x19]
00c2c4e4	mov x0,x19
00c2c4e8	mov w1,wzr
00c2c4ec	ldr x8,[x8, #0x68]
00c2c4f0	blr x8
00c2c4f4	ldr x8,[sp, #0x28]
00c2c4f8	cbz x8,0x00c2c52c
00c2c4fc	ldr x8,[x19]
00c2c500	mov x0,x19
00c2c504	mov w1,#0xfffffffe
00c2c508	ldr x8,[x8, #0x18]
00c2c50c	blr x8
00c2c510	ldr x8,[x19]
00c2c514	ldr x9,[sp, #0x28]
00c2c518	mov w1,#0xfffffffe
00c2c51c	ldr x8,[x8, #0x20]
00c2c520	add x2,x9,x0
00c2c524	mov x0,x19
00c2c528	blr x8
00c2c52c	mov w0,wzr
00c2c530	ldp x20,x19,[sp, #0x70]
00c2c534	ldr x21,[sp, #0x60]
00c2c538	ldp x29,x30,[sp, #0x50]
00c2c53c	add sp,sp,#0x80
00c2c540	autiasp
00c2c544	ret
00c2c548	mov w0,#0xffffe672
00c2c54c	ldp x20,x19,[sp, #0x70]
00c2c550	ldr x21,[sp, #0x60]
00c2c554	ldp x29,x30,[sp, #0x50]
00c2c558	add sp,sp,#0x80
00c2c55c	autiasp
00c2c560	ret
