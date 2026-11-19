; FUN_00b9682c @ 00b9682c
00b9682c	stp x20,x19,[sp, #-0x20]!
00b96830	stp x29,x30,[sp, #0x10]
00b96834	add x29,sp,#0x10
00b96838	orr w1,wzr,#0x6
00b9683c	mov x20,x0
00b96840	bl 0x00c41bf0
00b96844	mov w19,w0
00b96848	cbnz w0,0x00b96904
00b9684c	ldr x8,[x20]
00b96850	ldrh w9,[x20, #0xa]
00b96854	mov w13,#0x2
00b96858	ldp x11,x15,[x8]
00b9685c	ldr x12,[x8, #0x18]
00b96860	mov x10,x8
00b96864	ldr x14,[x10, #0x28]!
00b96868	mov x0,x8
00b9686c	adds x11,x12,x11
00b96870	cset w16,cs
00b96874	csinc x17,x13,xzr,cs
00b96878	adds x11,x14,x11
00b9687c	str x11,[x8]
00b96880	csel x11,x16,x17,cc
00b96884	adds x11,x11,x15
00b96888	ldr x15,[x0, #0x20]!
00b9688c	cset w16,cs
00b96890	csinc x17,x13,xzr,cs
00b96894	adds x11,x11,x12
00b96898	csel x12,x16,x17,cc
00b9689c	ldr x16,[x8, #0x10]
00b968a0	adds x11,x15,x11
00b968a4	cinc x12,x12,cs
00b968a8	adds x11,x14,x11
00b968ac	str x11,[x8, #0x8]
00b968b0	cinc x11,x12,cs
00b968b4	adds x11,x11,x16
00b968b8	cset w12,cs
00b968bc	csinc x13,x13,xzr,cs
00b968c0	adds x11,x11,x15
00b968c4	csel x12,x12,x13,cc
00b968c8	adds x11,x14,x11
00b968cc	str x11,[x8, #0x10]
00b968d0	cinc x11,x12,cs
00b968d4	cmp x9,#0x5
00b968d8	str x11,[x8, #0x18]
00b968dc	b.cc 0x00b96904
00b968e0	add x9,x8,x9, LSL #0x3
00b968e4	cmp x9,x10
00b968e8	csel x9,x9,x10,hi
00b968ec	mvn x8,x8
00b968f0	add x8,x9,x8
00b968f4	sub x8,x8,#0x18
00b968f8	and x2,x8,#-0x8
00b968fc	mov w1,wzr
00b96900	bl 0x00c301c0
00b96904	ldp x29,x30,[sp, #0x10]
00b96908	mov w0,w19
00b9690c	ldp x20,x19,[sp], #0x20
00b96910	ret
