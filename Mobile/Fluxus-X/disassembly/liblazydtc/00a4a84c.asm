; gf_hibit @ 00a4a84c
00a4a84c	sub sp,sp,#0x50
00a4a850	stp x29,x30,[sp, #0x40]
00a4a854	ldp x10,x11,[x0, #0x30]
00a4a858	ldp x14,x15,[x0, #0x20]
00a4a85c	ldp x12,x13,[x0, #0x10]
00a4a860	ldp x8,x9,[x0]
00a4a864	ubfiz x16,x11,#0x1,#0x37
00a4a868	lsr x17,x10,#0x37
00a4a86c	ubfiz x10,x10,#0x1,#0x37
00a4a870	lsr x18,x15,#0x37
00a4a874	add x16,x16,w17, UXTB 
00a4a878	ubfiz x17,x13,#0x1,#0x37
00a4a87c	add x10,x10,w18, UXTB 
00a4a880	lsr x18,x12,#0x37
00a4a884	ubfiz x12,x12,#0x1,#0x37
00a4a888	add x17,x17,w18, UXTB 
00a4a88c	lsr x18,x9,#0x37
00a4a890	ubfx x11,x11,#0x37,#0x8
00a4a894	add x12,x12,w18, UXTB 
00a4a898	lsr x18,x8,#0x37
00a4a89c	ubfiz x15,x15,#0x1,#0x37
00a4a8a0	ubfiz x8,x8,#0x1,#0x37
00a4a8a4	add x14,x11,x14, LSL #0x1
00a4a8a8	lsr x13,x13,#0x37
00a4a8ac	add x8,x11,x8
00a4a8b0	add x11,x15,x14, LSR #0x38
00a4a8b4	and x14,x14,#0xffffffffffffff
00a4a8b8	lsr x15,x16,#0x38
00a4a8bc	and x16,x16,#0xffffffffffffff
00a4a8c0	ubfiz x9,x9,#0x1,#0x37
00a4a8c4	add x13,x14,w13, UXTB 
00a4a8c8	and x14,x10,#0xffffffffffffff
00a4a8cc	add x10,x16,x10, LSR #0x38
00a4a8d0	and x16,x17,#0xffffffffffffff
00a4a8d4	add x9,x9,w18, UXTB 
00a4a8d8	add x16,x16,x12, LSR #0x38
00a4a8dc	and x12,x12,#0xffffffffffffff
00a4a8e0	add x12,x12,x9, LSR #0x38
00a4a8e4	and x9,x9,#0xffffffffffffff
00a4a8e8	add x14,x14,x11, LSR #0x38
00a4a8ec	and x11,x11,#0xffffffffffffff
00a4a8f0	add x13,x13,x15
00a4a8f4	add x9,x9,x8, LSR #0x38
00a4a8f8	and x8,x8,#0xffffffffffffff
00a4a8fc	stp x14,x10,[sp, #0x30]
00a4a900	add x10,x11,x13, LSR #0x38
00a4a904	and x11,x13,#0xffffffffffffff
00a4a908	add x8,x8,x15
00a4a90c	str x10,[sp, #0x28]
00a4a910	add x10,x11,x17, LSR #0x38
00a4a914	mov x0,sp
00a4a918	add x29,sp,#0x40
00a4a91c	stp x16,x10,[sp, #0x18]
00a4a920	stp x9,x12,[sp, #0x8]
00a4a924	str x8,[sp]
00a4a928	bl 0x00a4a620
00a4a92c	ldr x8,[sp]
00a4a930	ldp x29,x30,[sp, #0x40]
00a4a934	and x8,x8,#0x1
00a4a938	neg x0,x8
00a4a93c	add sp,sp,#0x50
00a4a940	ret
