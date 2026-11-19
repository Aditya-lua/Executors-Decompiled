; FUN_0088a6c0 @ 0088a6c0
0088a6c0	sub sp,sp,#0xa0
0088a6c4	stp x29,x30,[sp, #0x40]
0088a6c8	stp x28,x27,[sp, #0x50]
0088a6cc	stp x26,x25,[sp, #0x60]
0088a6d0	stp x24,x23,[sp, #0x70]
0088a6d4	stp x22,x21,[sp, #0x80]
0088a6d8	stp x20,x19,[sp, #0x90]
0088a6dc	add x29,sp,#0x40
0088a6e0	mrs x8,tpidr_el0
0088a6e4	mov x20,x1
0088a6e8	mov x19,x0
0088a6ec	str x8,[sp, #0x18]
0088a6f0	ldr x8,[x8, #0x28]
0088a6f4	stur x8,[x29, #-0x8]
0088a6f8	ldr x8,[x0, #0x688]
0088a6fc	ldr x9,[x0, #0x680]
0088a700	ldr x26,[x0, #0x7c0]
0088a704	ldr x24,[x0, #0x7b8]
0088a708	str xzr,[sp, #0x30]
0088a70c	sub x8,x8,x9
0088a710	asr x22,x8,#0x3
0088a714	ldr w8,[x0, #0x64c]
0088a718	str w8,[sp, #0x14]
0088a71c	stp x22,x22,[sp, #0x20]
0088a720	add x0,x0,#0x7d0
0088a724	add x1,sp,#0x20
0088a728	bl 0x008948a4
0088a72c	ldr w21,[x19, #0x64c]
0088a730	mov w9,#0x1
0088a734	strb w9,[x19, #0x660]
0088a738	add w8,w21,#0x3
0088a73c	cmp w8,#0x100
0088a740	b.cs 0x0088aa80
0088a744	ldr w9,[x19, #0x650]
0088a748	str w8,[x19, #0x64c]
0088a74c	cmp w9,w8
0088a750	csel w8,w9,w8,hi
0088a754	str w8,[x19, #0x650]
0088a758	add x1,x20,#0x30
0088a75c	mov x0,x19
0088a760	mov w2,w21
0088a764	mov w3,#0x3
0088a768	mov w4,#0x1
0088a76c	bl 0x00895520
0088a770	ldr w8,[x20, #0x28]
0088a774	mov w9,#0x2
0088a778	ldr w28,[x19, #0x64c]
0088a77c	cmp w8,#0x2
0088a780	csel w2,w8,w9,hi
0088a784	add w8,w2,w28
0088a788	cmp w8,#0x100
0088a78c	b.cs 0x0088aaac
0088a790	ldr w9,[x19, #0x650]
0088a794	ldr x0,[x19]
0088a798	str w8,[x19, #0x64c]
0088a79c	cmp w9,w8
0088a7a0	csel w8,w9,w8,hi
0088a7a4	str w8,[x19, #0x650]
0088a7a8	bl 0x008769d0
0088a7ac	ldr w8,[x19, #0x8]
0088a7b0	mov w23,w0
0088a7b4	str x24,[sp]
0088a7b8	cmp w8,#0x1
0088a7bc	b.lt 0x0088a850
0088a7c0	ldr x8,[x20, #0x28]
0088a7c4	cmp x8,#0x2
0088a7c8	b.hi 0x0088a850
0088a7cc	ldr x8,[x20, #0x38]
0088a7d0	cmp x8,#0x2
0088a7d4	b.eq 0x0088a840
0088a7d8	cmp x8,#0x1
0088a7dc	b.ne 0x0088a850
0088a7e0	ldur x8,[x20, #0x30]
0088a7e4	adrp x9,0xd1b000
0088a7e8	ldr w9,[x9, #0x40]
0088a7ec	ldr x8,[x8]
0088a7f0	ldr w10,[x8, #0x8]
0088a7f4	cmp w10,w9
0088a7f8	b.ne 0x0088a850
0088a7fc	ldr x0,[x8, #0x20]
0088a800	add x1,x19,#0xd8
0088a804	add x2,x19,#0x110
0088a808	bl 0x0087deec
0088a80c	mov w24,#0x4c
0088a810	cbnz x0,0x0088a854
0088a814	mov x25,x1
0088a818	cbz x1,0x0088a854
0088a81c	adrp x1,0x2a9000
0088a820	add x1,x1,#0x3ee
0088a824	mov x0,x25
0088a828	bl 0x00c301f0
0088a82c	cbz w0,0x0088aa54
0088a830	adrp x1,0x2c6000
0088a834	add x1,x1,#0xb3e
0088a838	mov x0,x25
0088a83c	b 0x0088aa3c
0088a840	ldrb w8,[x19, #0x678]
0088a844	tbnz w8,#0x0,0x0088a850
0088a848	ldrb w8,[x19, #0x679]
0088a84c	tbz w8,#0x0,0x0088aa0c
0088a850	mov w24,#0x4c
0088a854	ldr x0,[x19]
0088a858	str x26,[sp, #0x8]
0088a85c	bl 0x00875ec8
0088a860	mov x25,x0
0088a864	ldr x0,[x19]
0088a868	mov w1,w24
0088a86c	mov w2,w21
0088a870	mov w3,wzr
0088a874	bl 0x00875cac
0088a878	ldr x0,[x19]
0088a87c	bl 0x00875ec8
0088a880	ldr x8,[x20, #0x28]
0088a884	mov x26,x0
0088a888	cbz x8,0x0088a8b8
0088a88c	mov x27,xzr
0088a890	ldr x8,[x20, #0x20]
0088a894	ldr x1,[x8, x27, LSL #0x3]
0088a898	add w2,w27,w28
0088a89c	mov x0,x19
0088a8a0	mov w3,w23
0088a8a4	bl 0x00884b7c
0088a8a8	ldr x8,[x20, #0x28]
0088a8ac	add x27,x27,#0x1
0088a8b0	cmp x27,x8
0088a8b4	b.cc 0x0088a890
0088a8b8	ldr x1,[x20, #0x40]
0088a8bc	mov x0,x19
0088a8c0	bl 0x0088506c
0088a8c4	mov x0,x19
0088a8c8	mov x1,x22
0088a8cc	bl 0x008860c8
0088a8d0	mov x0,x19
0088a8d4	mov x1,x22
0088a8d8	bl 0x008862e0
0088a8dc	ldr w8,[x19, #0xc]
0088a8e0	cmp w8,#0x1
0088a8e4	b.lt 0x0088a8f8
0088a8e8	ldr x0,[x19]
0088a8ec	ldr w8,[x20, #0xc]
0088a8f0	add w1,w8,#0x1
0088a8f4	bl 0x00876644
0088a8f8	ldr x0,[x19]
0088a8fc	bl 0x00875ec8
0088a900	mov x22,x0
0088a904	ldr x0,[x19]
0088a908	bl 0x00875ec8
0088a90c	mov x23,x0
0088a910	ldr x0,[x19]
0088a914	mov w1,#0x3a
0088a918	mov w2,w21
0088a91c	mov w3,wzr
0088a920	bl 0x00875cac
0088a924	cmp w24,#0x3b
0088a928	ldr w8,[x20, #0x28]
0088a92c	ldr x0,[x19]
0088a930	cset w9,eq
0088a934	orr w1,w8,w9, LSL #0x1f
0088a938	bl 0x00875d18
0088a93c	ldr x0,[x19]
0088a940	bl 0x00875ec8
0088a944	mov x21,x0
0088a948	ldr x0,[x19]
0088a94c	mov x1,x25
0088a950	mov x2,x23
0088a954	bl 0x00875ed8
0088a958	tbz w0,#0x0,0x0088aa5c
0088a95c	ldr x0,[x19]
0088a960	mov x1,x23
0088a964	mov x2,x26
0088a968	bl 0x00875ed8
0088a96c	tbz w0,#0x0,0x0088aa5c
0088a970	ldp x9,x8,[sp]
0088a974	mov x0,x19
0088a978	mov x1,x20
0088a97c	mov x3,x21
0088a980	mov x4,x22
0088a984	sub x24,x8,x9
0088a988	asr x23,x24,#0x4
0088a98c	mov x2,x23
0088a990	bl 0x008949bc
0088a994	ldr x9,[x19, #0x7c0]
0088a998	ldr x8,[x19, #0x7b8]
0088a99c	sub x9,x9,x8
0088a9a0	asr x9,x9,#0x4
0088a9a4	subs x1,x23,x9
0088a9a8	b.ls 0x0088a9b8
0088a9ac	add x0,x19,#0x7b8
0088a9b0	bl 0x00894a8c
0088a9b4	b 0x0088a9c4
0088a9b8	b.cs 0x0088a9c4
0088a9bc	add x8,x8,x24
0088a9c0	str x8,[x19, #0x7c0]
0088a9c4	ldr x8,[x19, #0x7d8]
0088a9c8	sub x8,x8,#0x18
0088a9cc	str x8,[x19, #0x7d8]
0088a9d0	ldr w8,[sp, #0x14]
0088a9d4	str w8,[x19, #0x64c]
0088a9d8	ldr x8,[sp, #0x18]
0088a9dc	ldr x8,[x8, #0x28]
0088a9e0	ldur x9,[x29, #-0x8]
0088a9e4	cmp x8,x9
0088a9e8	b.ne 0x0088ab20
0088a9ec	ldp x20,x19,[sp, #0x90]
0088a9f0	ldp x22,x21,[sp, #0x80]
0088a9f4	ldp x24,x23,[sp, #0x70]
0088a9f8	ldp x26,x25,[sp, #0x60]
0088a9fc	ldp x28,x27,[sp, #0x50]
0088aa00	ldp x29,x30,[sp, #0x40]
0088aa04	add sp,sp,#0xa0
0088aa08	ret
0088aa0c	ldur x8,[x20, #0x30]
0088aa10	ldr x0,[x8]
0088aa14	add x1,x19,#0xd8
0088aa18	add x2,x19,#0x110
0088aa1c	bl 0x0087deec
0088aa20	mov w24,#0x4c
0088aa24	cbnz x0,0x0088a854
0088aa28	cbz x1,0x0088a854
0088aa2c	adrp x8,0x2ca000
0088aa30	add x8,x8,#0xc1a
0088aa34	mov x0,x1
0088aa38	mov x1,x8
0088aa3c	bl 0x00c301f0
0088aa40	mov w8,#0x4c
0088aa44	cmp w0,#0x0
0088aa48	mov w9,#0x3d
0088aa4c	csel w24,w9,w8,eq
0088aa50	b 0x0088a854
0088aa54	mov w24,#0x3b
0088aa58	b 0x0088a854
0088aa5c	ldr x8,[sp, #0x18]
0088aa60	ldr x8,[x8, #0x28]
0088aa64	ldur x9,[x29, #-0x8]
0088aa68	cmp x8,x9
0088aa6c	b.ne 0x0088ab20
0088aa70	adrp x1,0x2ab000
0088aa74	add x1,x1,#0x47b
0088aa78	add x0,x20,#0xc
0088aa7c	bl 0x0087fcd8
0088aa80	ldr x8,[sp, #0x18]
0088aa84	ldr x8,[x8, #0x28]
0088aa88	ldur x9,[x29, #-0x8]
0088aa8c	cmp x8,x9
0088aa90	b.ne 0x0088ab20
0088aa94	adrp x1,0x2d0000
0088aa98	add x1,x1,#0xc00
0088aa9c	add x0,x20,#0xc
0088aaa0	mov w2,#0x3
0088aaa4	mov w3,#0xff
0088aaa8	bl 0x0087fcd8
0088aaac	ldr x8,[sp, #0x18]
0088aab0	ldr x8,[x8, #0x28]
0088aab4	ldur x9,[x29, #-0x8]
0088aab8	cmp x8,x9
0088aabc	b.ne 0x0088ab20
0088aac0	adrp x1,0x2d0000
0088aac4	add x1,x1,#0xc00
0088aac8	add x0,x20,#0xc
0088aacc	mov w3,#0xff
0088aad0	bl 0x0087fcd8
0088ab20	bl 0x00c2fec0
