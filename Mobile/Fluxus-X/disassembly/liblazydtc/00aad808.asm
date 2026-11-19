; OBJ_NAME_do_all_sorted @ 00aad808
00aad808	sub sp,sp,#0x60
00aad80c	stp x22,x21,[sp, #0x30]
00aad810	adrp x22,0xd22000
00aad814	ldr x8,[x22, #0x178]
00aad818	mov w21,w0
00aad81c	str w0,[sp, #0x8]
00aad820	stp x20,x19,[sp, #0x40]
00aad824	mov x0,x8
00aad828	stp x29,x30,[sp, #0x50]
00aad82c	add x29,sp,#0x50
00aad830	mov x19,x2
00aad834	mov x20,x1
00aad838	bl 0x00c35880
00aad83c	adrp x1,0x2b2000
00aad840	lsl x0,x0,#0x3
00aad844	add x1,x1,#0x57b
00aad848	mov w2,#0x151
00aad84c	bl 0x00c32320
00aad850	str x0,[sp, #0x10]
00aad854	cbz x0,0x00aad8e4
00aad858	ldr x0,[x22, #0x178]
00aad85c	adrp x8,0xaad000
00aad860	add x8,x8,#0x8f8
00aad864	adrp x1,0xaad000
00aad868	str x8,[sp, #0x20]
00aad86c	add x8,sp,#0x8
00aad870	add x1,x1,#0x7ec
00aad874	add x2,sp,#0x18
00aad878	str wzr,[sp, #0xc]
00aad87c	str w21,[sp, #0x18]
00aad880	str x8,[sp, #0x28]
00aad884	bl 0x00c395c0
00aad888	ldr x0,[sp, #0x10]
00aad88c	ldrsw x1,[sp, #0xc]
00aad890	adrp x3,0xaad000
00aad894	add x3,x3,#0x920
00aad898	mov w2,#0x8
00aad89c	bl 0x00c31d30
00aad8a0	ldr w8,[sp, #0xc]
00aad8a4	cmp w8,#0x1
00aad8a8	b.lt 0x00aad8d0
00aad8ac	mov x21,xzr
00aad8b0	ldr x8,[sp, #0x10]
00aad8b4	mov x1,x19
00aad8b8	ldr x0,[x8, x21, LSL #0x3]
00aad8bc	blr x20
00aad8c0	ldrsw x8,[sp, #0xc]
00aad8c4	add x21,x21,#0x1
00aad8c8	cmp x21,x8
00aad8cc	b.lt 0x00aad8b0
00aad8d0	ldr x0,[sp, #0x10]
00aad8d4	adrp x1,0x2b2000
00aad8d8	add x1,x1,#0x57b
00aad8dc	mov w2,#0x15c
00aad8e0	bl 0x00c32310
00aad8e4	ldp x29,x30,[sp, #0x50]
00aad8e8	ldp x20,x19,[sp, #0x40]
00aad8ec	ldp x22,x21,[sp, #0x30]
00aad8f0	add sp,sp,#0x60
00aad8f4	ret
