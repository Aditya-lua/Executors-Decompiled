; FUN_00bd642c @ 00bd642c
00bd642c	paciasp
00bd6430	sub sp,sp,#0x60
00bd6434	stp x29,x30,[sp, #0x20]
00bd6438	stp x24,x23,[sp, #0x30]
00bd643c	stp x22,x21,[sp, #0x40]
00bd6440	stp x20,x19,[sp, #0x50]
00bd6444	add x29,sp,#0x20
00bd6448	mov x20,x1
00bd644c	mov x19,x0
00bd6450	add x0,sp,#0x8
00bd6454	mov x1,x19
00bd6458	bl 0x00c44040
00bd645c	ldrb w8,[sp, #0x8]
00bd6460	cmp w8,#0x1
00bd6464	b.ne 0x00bd6534
00bd6468	ldr x8,[x19]
00bd646c	ldur x9,[x8, #-0x18]
00bd6470	sub x8,x29,#0x8
00bd6474	add x0,x19,x9
00bd6478	bl 0x00c30070
00bd647c	adrp x1,0xcb5000
00bd6480	sub x0,x29,#0x8
00bd6484	ldr x1,[x1, #0xbb0]
00bd6488	bl 0x00c30080
00bd648c	mov x21,x0
00bd6490	sub x0,x29,#0x8
00bd6494	bl 0x00c30090
00bd6498	ldr x8,[x19]
00bd649c	ldur x8,[x8, #-0x18]
00bd64a0	add x2,x19,x8
00bd64a4	ldr w3,[x2, #0x90]
00bd64a8	ldr x22,[x2, #0x28]
00bd64ac	cmn w3,#0x1
00bd64b0	b.ne 0x00bd64fc
00bd64b4	sub x8,x29,#0x8
00bd64b8	mov x0,x2
00bd64bc	mov x24,x2
00bd64c0	bl 0x00c30070
00bd64c4	adrp x1,0xcb5000
00bd64c8	sub x0,x29,#0x8
00bd64cc	ldr x1,[x1, #0xb98]
00bd64d0	bl 0x00c30080
00bd64d4	ldr x8,[x0]
00bd64d8	ldr x8,[x8, #0x58]
00bd64dc	mov w1,#0x20
00bd64e0	blr x8
00bd64e4	mov w23,w0
00bd64e8	sub x0,x29,#0x8
00bd64ec	bl 0x00c30090
00bd64f0	mov x2,x24
00bd64f4	mov w3,w23
00bd64f8	str w23,[x24, #0x90]
00bd64fc	ldr x8,[x21]
00bd6500	ldr x8,[x8, #0x20]
00bd6504	mov x0,x21
00bd6508	mov x1,x22
00bd650c	mov x4,x20
00bd6510	blr x8
00bd6514	cbnz x0,0x00bd6534
00bd6518	ldr x8,[x19]
00bd651c	mov w9,#0x5
00bd6520	ldur x8,[x8, #-0x18]
00bd6524	add x0,x19,x8
00bd6528	ldr w8,[x0, #0x20]
00bd652c	orr w1,w8,w9
00bd6530	bl 0x00c30130
00bd6534	add x0,sp,#0x8
00bd6538	bl 0x00c44050
00bd653c	mov x0,x19
00bd6540	ldp x20,x19,[sp, #0x50]
00bd6544	ldp x22,x21,[sp, #0x40]
00bd6548	ldp x24,x23,[sp, #0x30]
00bd654c	ldp x29,x30,[sp, #0x20]
00bd6550	add sp,sp,#0x60
00bd6554	autiasp
00bd6558	ret
