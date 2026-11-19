; OBJ_NAME_get @ 00aad490
00aad490	sub sp,sp,#0x50
00aad494	stp x22,x21,[sp, #0x20]
00aad498	stp x20,x19,[sp, #0x30]
00aad49c	stp x29,x30,[sp, #0x40]
00aad4a0	add x29,sp,#0x40
00aad4a4	cbz x0,0x00aad544
00aad4a8	mov w19,w1
00aad4ac	mov x20,x0
00aad4b0	adrp x0,0xd22000
00aad4b4	adrp x1,0xaad000
00aad4b8	add x0,x0,#0x160
00aad4bc	add x1,x1,#0x21c
00aad4c0	bl 0x00c34d60
00aad4c4	cbz w0,0x00aad544
00aad4c8	adrp x8,0xd22000
00aad4cc	ldr w8,[x8, #0x164]
00aad4d0	mov x21,xzr
00aad4d4	cbz w8,0x00aad558
00aad4d8	adrp x22,0xd22000
00aad4dc	ldr x0,[x22, #0x168]
00aad4e0	bl 0x00c35680
00aad4e4	cbz w0,0x00aad544
00aad4e8	adrp x21,0xd22000
00aad4ec	ldr x0,[x21, #0x178]
00aad4f0	and w8,w19,#0xffff7fff
00aad4f4	add x1,sp,#0x8
00aad4f8	str x20,[sp, #0x10]
00aad4fc	str w8,[sp, #0x8]
00aad500	bl 0x00c34de0
00aad504	cbz x0,0x00aad53c
00aad508	mov w20,#0xffffffff
00aad50c	tbnz w19,#0xf,0x00aad54c
00aad510	ldr w8,[x0, #0x4]
00aad514	cbz w8,0x00aad54c
00aad518	add w20,w20,#0x1
00aad51c	cmp w20,#0x9
00aad520	b.hi 0x00aad53c
00aad524	ldr x8,[x0, #0x10]
00aad528	ldr x0,[x21, #0x178]
00aad52c	add x1,sp,#0x8
00aad530	str x8,[sp, #0x10]
00aad534	bl 0x00c34de0
00aad538	cbnz x0,0x00aad50c
00aad53c	mov x21,xzr
00aad540	b 0x00aad550
00aad544	mov x21,xzr
00aad548	b 0x00aad558
00aad54c	ldr x21,[x0, #0x10]
00aad550	ldr x0,[x22, #0x168]
00aad554	bl 0x00c35690
00aad558	mov x0,x21
00aad55c	ldp x29,x30,[sp, #0x40]
00aad560	ldp x20,x19,[sp, #0x30]
00aad564	ldp x22,x21,[sp, #0x20]
00aad568	add sp,sp,#0x50
00aad56c	ret
