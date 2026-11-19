; FUN_00aca884 @ 00aca884
00aca884	str x21,[sp, #-0x30]!
00aca888	stp x20,x19,[sp, #0x10]
00aca88c	stp x29,x30,[sp, #0x20]
00aca890	ldr x20,[x0, #0x28]
00aca894	ldr x8,[x0, #0x8]
00aca898	add x29,sp,#0x20
00aca89c	sub x9,x20,x8
00aca8a0	cmp x9,x1
00aca8a4	b.cs 0x00aca9c8
00aca8a8	ldr w9,[x0, #0x10]
00aca8ac	mov x19,x0
00aca8b0	cbnz w9,0x00aca934
00aca8b4	ldr x9,[x19, #0x20]
00aca8b8	sub x10,x9,x8
00aca8bc	cmp x10,x1
00aca8c0	b.cc 0x00aca934
00aca8c4	lsr x10,x9,#0x1
00aca8c8	lsl x11,x20,#0x1
00aca8cc	cmp x20,x10
00aca8d0	csel x20,x11,x9,cc
00aca8d4	sub x11,x20,x8
00aca8d8	cmp x11,x1
00aca8dc	b.cc 0x00aca8c8
00aca8e0	ldr w8,[x19, #0x14]
00aca8e4	cbz w8,0x00aca964
00aca8e8	adrp x1,0x29e000
00aca8ec	add x1,x1,#0x966
00aca8f0	mov w2,#0xde
00aca8f4	mov x0,x20
00aca8f8	bl 0x00c35710
00aca8fc	mov x21,x0
00aca900	cbz x0,0x00aca980
00aca904	ldp x1,x2,[x19]
00aca908	mov x0,x21
00aca90c	bl 0x00c2ffd0
00aca910	ldr w8,[x19, #0x14]
00aca914	ldr x0,[x19]
00aca918	ldr x1,[x19, #0x28]
00aca91c	adrp x2,0x29e000
00aca920	add x2,x2,#0x966
00aca924	cbz w8,0x00aca9b8
00aca928	mov w3,#0xe7
00aca92c	bl 0x00c38e10
00aca930	b 0x00aca9c0
00aca934	bl 0x00c342a0
00aca938	adrp x0,0x29e000
00aca93c	adrp x2,0x2b2000
00aca940	add x0,x0,#0x966
00aca944	add x2,x2,#0xa8f
00aca948	mov w1,#0xd5
00aca94c	bl 0x00c342b0
00aca950	mov w8,#0x100
00aca954	movk w8,#0xc, LSL #16
00aca958	add w1,w8,#0x3
00aca95c	mov w0,#0x24
00aca960	b 0x00aca9a8
00aca964	adrp x1,0x29e000
00aca968	add x1,x1,#0x966
00aca96c	orr w2,wzr,#0xe0
00aca970	mov x0,x20
00aca974	bl 0x00c34250
00aca978	mov x21,x0
00aca97c	cbnz x0,0x00aca904
00aca980	bl 0x00c342a0
00aca984	adrp x0,0x29e000
00aca988	adrp x2,0x2b2000
00aca98c	add x0,x0,#0x966
00aca990	add x2,x2,#0xa8f
00aca994	mov w1,#0xe2
00aca998	bl 0x00c342b0
00aca99c	mov w1,#0x100
00aca9a0	mov w0,#0x24
00aca9a4	movk w1,#0xc, LSL #16
00aca9a8	mov x2,xzr
00aca9ac	bl 0x00c342c0
00aca9b0	mov w0,wzr
00aca9b4	b 0x00aca9cc
00aca9b8	mov w3,#0xe9
00aca9bc	bl 0x00c345e0
00aca9c0	str x21,[x19]
00aca9c4	str x20,[x19, #0x28]
00aca9c8	mov w0,#0x1
00aca9cc	ldp x29,x30,[sp, #0x20]
00aca9d0	ldp x20,x19,[sp, #0x10]
00aca9d4	ldr x21,[sp], #0x30
00aca9d8	ret
