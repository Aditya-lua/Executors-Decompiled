; FUN_00bd6764 @ 00bd6764
00bd6764	paciasp
00bd6768	sub sp,sp,#0x60
00bd676c	stp x29,x30,[sp, #0x20]
00bd6770	stp x24,x23,[sp, #0x30]
00bd6774	stp x22,x21,[sp, #0x40]
00bd6778	stp x20,x19,[sp, #0x50]
00bd677c	add x29,sp,#0x20
00bd6780	mov x20,x1
00bd6784	mov x19,x0
00bd6788	add x0,sp,#0x8
00bd678c	mov x1,x19
00bd6790	bl 0x00c44040
00bd6794	ldrb w8,[sp, #0x8]
00bd6798	cmp w8,#0x1
00bd679c	b.ne 0x00bd686c
00bd67a0	ldr x8,[x19]
00bd67a4	ldur x9,[x8, #-0x18]
00bd67a8	sub x8,x29,#0x8
00bd67ac	add x0,x19,x9
00bd67b0	bl 0x00c30070
00bd67b4	adrp x1,0xcb5000
00bd67b8	sub x0,x29,#0x8
00bd67bc	ldr x1,[x1, #0xbb0]
00bd67c0	bl 0x00c30080
00bd67c4	mov x21,x0
00bd67c8	sub x0,x29,#0x8
00bd67cc	bl 0x00c30090
00bd67d0	ldr x8,[x19]
00bd67d4	ldur x8,[x8, #-0x18]
00bd67d8	add x2,x19,x8
00bd67dc	ldr w3,[x2, #0x90]
00bd67e0	ldr x22,[x2, #0x28]
00bd67e4	cmn w3,#0x1
00bd67e8	b.ne 0x00bd6834
00bd67ec	sub x8,x29,#0x8
00bd67f0	mov x0,x2
00bd67f4	mov x24,x2
00bd67f8	bl 0x00c30070
00bd67fc	adrp x1,0xcb5000
00bd6800	sub x0,x29,#0x8
00bd6804	ldr x1,[x1, #0xb98]
00bd6808	bl 0x00c30080
00bd680c	ldr x8,[x0]
00bd6810	ldr x8,[x8, #0x58]
00bd6814	mov w1,#0x20
00bd6818	blr x8
00bd681c	mov w23,w0
00bd6820	sub x0,x29,#0x8
00bd6824	bl 0x00c30090
00bd6828	mov x2,x24
00bd682c	mov w3,w23
00bd6830	str w23,[x24, #0x90]
00bd6834	ldr x8,[x21]
00bd6838	ldr x8,[x8, #0x28]
00bd683c	mov x0,x21
00bd6840	mov x1,x22
00bd6844	mov x4,x20
00bd6848	blr x8
00bd684c	cbnz x0,0x00bd686c
00bd6850	ldr x8,[x19]
00bd6854	mov w9,#0x5
00bd6858	ldur x8,[x8, #-0x18]
00bd685c	add x0,x19,x8
00bd6860	ldr w8,[x0, #0x20]
00bd6864	orr w1,w8,w9
00bd6868	bl 0x00c30130
00bd686c	add x0,sp,#0x8
00bd6870	bl 0x00c44050
00bd6874	mov x0,x19
00bd6878	ldp x20,x19,[sp, #0x50]
00bd687c	ldp x22,x21,[sp, #0x40]
00bd6880	ldp x24,x23,[sp, #0x30]
00bd6884	ldp x29,x30,[sp, #0x20]
00bd6888	add sp,sp,#0x60
00bd688c	autiasp
00bd6890	ret
