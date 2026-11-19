; FUN_00a8a814 @ 00a8a814
00a8a814	sub sp,sp,#0x80
00a8a818	stp x24,x23,[sp, #0x40]
00a8a81c	stp x22,x21,[sp, #0x50]
00a8a820	stp x20,x19,[sp, #0x60]
00a8a824	mov x19,x3
00a8a828	mov x23,x2
00a8a82c	mov x20,x1
00a8a830	lsr x8,x3,#0x1e
00a8a834	mov x21,x0
00a8a838	stp x28,x27,[sp, #0x20]
00a8a83c	stp x26,x25,[sp, #0x30]
00a8a840	stp x29,x30,[sp, #0x70]
00a8a844	add x29,sp,#0x70
00a8a848	cbz x8,0x00a8a900
00a8a84c	orr x28,xzr,#-0x40000000
00a8a850	add x8,x19,x28
00a8a854	mov w22,#0x40000000
00a8a858	str x8,[sp, #0x8]
00a8a85c	and x8,x8,#-0x40000000
00a8a860	str x8,[sp]
00a8a864	add x8,x8,x22
00a8a868	str x8,[sp, #0x10]
00a8a86c	add x8,x23,x8
00a8a870	str x8,[sp, #0x18]
00a8a874	adrp x25,0xcb5000
00a8a878	ldr x25,[x25, #0x318]
00a8a87c	add x24,x21,#0x28
00a8a880	mov x26,x20
00a8a884	mov x0,x21
00a8a888	bl 0x00c3cea0
00a8a88c	mov x27,x0
00a8a890	mov x0,x21
00a8a894	bl 0x00c3cec0
00a8a898	mov w2,#0x40000000
00a8a89c	cbz w0,0x00a8a8bc
00a8a8a0	mov x0,x23
00a8a8a4	mov x1,x26
00a8a8a8	mov x3,x27
00a8a8ac	mov x4,x24
00a8a8b0	mov x5,x25
00a8a8b4	bl 0x00c3e250
00a8a8b8	b 0x00a8a8d4
00a8a8bc	mov x0,x23
00a8a8c0	mov x1,x26
00a8a8c4	mov x3,x27
00a8a8c8	mov x4,x24
00a8a8cc	mov x5,x25
00a8a8d0	bl 0x00c3e240
00a8a8d4	add x19,x19,x28
00a8a8d8	add x23,x23,x22
00a8a8dc	lsr x8,x19,#0x1e
00a8a8e0	add x26,x26,x22
00a8a8e4	cbnz x8,0x00a8a884
00a8a8e8	ldp x9,x8,[sp]
00a8a8ec	sub x19,x8,x9
00a8a8f0	ldp x8,x22,[sp, #0x10]
00a8a8f4	add x20,x20,x8
00a8a8f8	cbnz x19,0x00a8a908
00a8a8fc	b 0x00a8a960
00a8a900	mov x22,x23
00a8a904	cbz x19,0x00a8a960
00a8a908	mov x0,x21
00a8a90c	bl 0x00c3cea0
00a8a910	mov x23,x0
00a8a914	mov x0,x21
00a8a918	add x24,x21,#0x28
00a8a91c	bl 0x00c3cec0
00a8a920	adrp x5,0xcb5000
00a8a924	ldr x5,[x5, #0x318]
00a8a928	cbz w0,0x00a8a948
00a8a92c	mov x0,x22
00a8a930	mov x1,x20
00a8a934	mov x2,x19
00a8a938	mov x3,x23
00a8a93c	mov x4,x24
00a8a940	bl 0x00c3e250
00a8a944	b 0x00a8a960
00a8a948	mov x0,x22
00a8a94c	mov x1,x20
00a8a950	mov x2,x19
00a8a954	mov x3,x23
00a8a958	mov x4,x24
00a8a95c	bl 0x00c3e240
00a8a960	ldp x29,x30,[sp, #0x70]
00a8a964	ldp x20,x19,[sp, #0x60]
00a8a968	ldp x22,x21,[sp, #0x50]
00a8a96c	ldp x24,x23,[sp, #0x40]
00a8a970	ldp x26,x25,[sp, #0x30]
00a8a974	ldp x28,x27,[sp, #0x20]
00a8a978	mov w0,#0x1
00a8a97c	add sp,sp,#0x80
00a8a980	ret
