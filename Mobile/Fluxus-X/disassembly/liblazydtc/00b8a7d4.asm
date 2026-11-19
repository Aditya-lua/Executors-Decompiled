; FUN_00b8a7d4 @ 00b8a7d4
00b8a7d4	sub sp,sp,#0x50
00b8a7d8	str x23,[sp, #0x10]
00b8a7dc	stp x22,x21,[sp, #0x20]
00b8a7e0	stp x20,x19,[sp, #0x30]
00b8a7e4	stp x29,x30,[sp, #0x40]
00b8a7e8	add x29,sp,#0x40
00b8a7ec	mrs x23,tpidr_el0
00b8a7f0	ldr x9,[x23, #0x28]
00b8a7f4	cmp w3,#0x1
00b8a7f8	mov w10,#0x200
00b8a7fc	mov w11,#0x100
00b8a800	str x9,[sp, #0x8]
00b8a804	str xzr,[sp]
00b8a808	ldr w9,[x0]
00b8a80c	mov w21,w3
00b8a810	mov w20,w2
00b8a814	mov w8,w1
00b8a818	mov x19,x0
00b8a81c	csel w2,w11,w10,eq
00b8a820	cbz w9,0x00b8a82c
00b8a824	mov w22,#0xffffff77
00b8a828	b 0x00b8a9c0
00b8a82c	and w9,w20,#0x7f000000
00b8a830	mov w10,#0x4000000
00b8a834	cmp w9,w10
00b8a838	b.ne 0x00b8a9bc
00b8a83c	mov x1,sp
00b8a840	mov w0,w8
00b8a844	mov w3,w20
00b8a848	bl 0x00b86e5c
00b8a84c	mov w22,w0
00b8a850	cbnz w0,0x00b8a9c0
00b8a854	ldrb w8,[x19, #0x4]
00b8a858	mov w9,#0x4400
00b8a85c	movk w9,#0x440, LSL #16
00b8a860	cmp w20,w9
00b8a864	cset w9,ne
00b8a868	and w8,w8,#0xfc
00b8a86c	orr w8,w8,w9
00b8a870	strb w8,[x19, #0x4]
00b8a874	ldr x1,[sp]
00b8a878	ldrh w8,[x1]
00b8a87c	and w9,w8,#0x7000
00b8a880	cmp w9,#0x2, LSL #12
00b8a884	b.ne 0x00b8a914
00b8a888	and w9,w8,#0x700
00b8a88c	cbz w9,0x00b8a914
00b8a890	mov w9,#0xfff
00b8a894	movk w9,#0x4c0, LSL #16
00b8a898	cmp w20,w9
00b8a89c	b.gt 0x00b8a8d4
00b8a8a0	mov w9,#0x4000
00b8a8a4	movk w9,#0x440, LSL #16
00b8a8a8	cmp w20,w9
00b8a8ac	b.eq 0x00b8a904
00b8a8b0	mov w9,#0x4100
00b8a8b4	movk w9,#0x440, LSL #16
00b8a8b8	cmp w20,w9
00b8a8bc	b.eq 0x00b8a904
00b8a8c0	mov w9,#0xff00
00b8a8c4	movk w9,#0x440, LSL #16
00b8a8c8	cmp w20,w9
00b8a8cc	b.eq 0x00b8a904
00b8a8d0	b 0x00b8a914
00b8a8d4	mov w9,#0x1000
00b8a8d8	movk w9,#0x4c0, LSL #16
00b8a8dc	cmp w20,w9
00b8a8e0	b.eq 0x00b8a904
00b8a8e4	mov w9,#0x1200
00b8a8e8	movk w9,#0x4c0, LSL #16
00b8a8ec	cmp w20,w9
00b8a8f0	b.eq 0x00b8a904
00b8a8f4	mov w9,#0x1100
00b8a8f8	movk w9,#0x4c0, LSL #16
00b8a8fc	cmp w20,w9
00b8a900	b.ne 0x00b8a914
00b8a904	ubfx w8,w8,#0x8,#0x3
00b8a908	mov w9,#0x1
00b8a90c	lsl w8,w9,w8
00b8a910	b 0x00b8a94c
00b8a914	mov w9,#0x100
00b8a918	movk w9,#0x480, LSL #16
00b8a91c	cmp w20,w9
00b8a920	b.ne 0x00b8a938
00b8a924	mov w9,#0x2004
00b8a928	cmp w8,w9
00b8a92c	b.ne 0x00b8a938
00b8a930	orr w8,wzr,#0xc
00b8a934	b 0x00b8a94c
00b8a938	mov w8,#0x1300
00b8a93c	movk w8,#0x4c0, LSL #16
00b8a940	cmp w20,w8
00b8a944	mov w8,#0xd
00b8a948	csel w8,w8,wzr,eq
00b8a94c	strb w8,[x19, #0x5]
00b8a950	ldp x2,x3,[x1, #0x28]
00b8a954	ldr w8,[x1, #0x4]
00b8a958	cmp w21,#0x1
00b8a95c	b.ne 0x00b8a98c
00b8a960	cmp w8,#0xff
00b8a964	b.hi 0x00b8a9bc
00b8a968	add x0,x19,#0x8
00b8a96c	mov w4,w20
00b8a970	bl 0x00c42eb0
00b8a974	mov w22,w0
00b8a978	cmn w0,#0x86
00b8a97c	b.eq 0x00b8a9c0
00b8a980	mov w20,wzr
00b8a984	cbz w22,0x00b8a9a8
00b8a988	b 0x00b8a9c8
00b8a98c	cmp w8,#0xff
00b8a990	b.hi 0x00b8a9bc
00b8a994	add x0,x19,#0x8
00b8a998	mov w4,w20
00b8a99c	bl 0x00c42e90
00b8a9a0	mov w22,w0
00b8a9a4	cbnz w0,0x00b8a9c0
00b8a9a8	mov w8,#0x1
00b8a9ac	str w8,[x19]
00b8a9b0	ldr x0,[sp]
00b8a9b4	bl 0x00c431e0
00b8a9b8	b 0x00b8a9fc
00b8a9bc	mov w22,#0xffffff79
00b8a9c0	cmp w22,#0x0
00b8a9c4	cset w20,eq
00b8a9c8	ldr w8,[x19]
00b8a9cc	cbz w8,0x00b8aa2c
00b8a9d0	cmp w8,#0x1
00b8a9d4	b.ne 0x00b8a9e0
00b8a9d8	add x0,x19,#0x8
00b8a9dc	bl 0x00c42e70
00b8a9e0	ldrb w8,[x19, #0x4]
00b8a9e4	str wzr,[x19]
00b8a9e8	and w8,w8,#0xfc
00b8a9ec	strb w8,[x19, #0x4]
00b8a9f0	ldr x0,[sp]
00b8a9f4	bl 0x00c431e0
00b8a9f8	tbz w20,#0x0,0x00b8aa00
00b8a9fc	mov w22,w0
00b8aa00	ldr x8,[x23, #0x28]
00b8aa04	ldr x9,[sp, #0x8]
00b8aa08	cmp x8,x9
00b8aa0c	b.ne 0x00b8aa3c
00b8aa10	mov w0,w22
00b8aa14	ldp x29,x30,[sp, #0x40]
00b8aa18	ldp x20,x19,[sp, #0x30]
00b8aa1c	ldp x22,x21,[sp, #0x20]
00b8aa20	ldr x23,[sp, #0x10]
00b8aa24	add sp,sp,#0x50
00b8aa28	ret
00b8aa2c	ldr x0,[sp]
00b8aa30	bl 0x00c431e0
00b8aa34	cbz w20,0x00b8aa00
00b8aa38	b 0x00b8a9fc
00b8aa3c	bl 0x00c2fec0
