; std::__ndk1::collate_byname<char>::collate_byname @ 00bfb87c
00bfb87c	paciasp
00bfb880	sub sp,sp,#0x50
00bfb884	stp x29,x30,[sp, #0x30]
00bfb888	stp x20,x19,[sp, #0x40]
00bfb88c	add x29,sp,#0x30
00bfb890	adrp x8,0xcb5000
00bfb894	mov x20,x1
00bfb898	mov x19,x0
00bfb89c	ldr x8,[x8, #0xe08]
00bfb8a0	sub x9,x2,#0x1
00bfb8a4	add x8,x8,#0x10
00bfb8a8	stp x8,x9,[x0]
00bfb8ac	mov w0,#0x1fbf
00bfb8b0	mov x2,xzr
00bfb8b4	bl 0x00c43890
00bfb8b8	str x0,[x19, #0x10]
00bfb8bc	cbz x0,0x00bfb8d4
00bfb8c0	ldp x20,x19,[sp, #0x40]
00bfb8c4	ldp x29,x30,[sp, #0x30]
00bfb8c8	add sp,sp,#0x50
00bfb8cc	autiasp
00bfb8d0	ret
00bfb8d4	mov x0,sp
00bfb8d8	mov x1,x20
00bfb8dc	bl 0x00852d7c
00bfb8e0	adrp x0,0x2b3000
00bfb8e4	add x0,x0,#0x21c
00bfb8e8	add x8,sp,#0x18
00bfb8ec	mov x1,sp
00bfb8f0	add x20,sp,#0x18
00bfb8f4	bl 0x00bfb964
00bfb8f8	ldrb w8,[sp, #0x18]
00bfb8fc	ldr x9,[sp, #0x28]
00bfb900	tst w8,#0x1
00bfb904	csinc x0,x9,x20,ne
00bfb908	bl 0x00c43d00
00bfb90c	ldrb w8,[sp, #0x18]
00bfb910	mov x20,x0
00bfb914	tbz w8,#0x0,0x00bfb930
00bfb918	ldr x8,[sp, #0x18]
00bfb91c	ldr x0,[sp, #0x28]
00bfb920	and x1,x8,#-0x2
00bfb924	bl 0x00c2fe80
00bfb928	b 0x00bfb930
00bfb930	ldrb w8,[sp]
00bfb934	tbz w8,#0x0,0x00bfb954
00bfb938	ldr x8,[sp]
00bfb93c	ldr x0,[sp, #0x10]
00bfb940	and x1,x8,#-0x2
00bfb944	bl 0x00c2fe80
00bfb948	b 0x00bfb954
00bfb954	mov x0,x19
00bfb958	bl 0x00c31530
00bfb95c	mov x0,x20
00bfb960	bl 0x00c2c090
