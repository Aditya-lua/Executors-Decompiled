; mbedtls_psa_ecdsa_sign_hash @ 00b9a840
00b9a840	sub sp,sp,#0xa0
00b9a844	str x27,[sp, #0x40]
00b9a848	stp x26,x25,[sp, #0x50]
00b9a84c	stp x24,x23,[sp, #0x60]
00b9a850	stp x22,x21,[sp, #0x70]
00b9a854	stp x20,x19,[sp, #0x80]
00b9a858	stp x29,x30,[sp, #0x90]
00b9a85c	add x29,sp,#0x90
00b9a860	mrs x26,tpidr_el0
00b9a864	ldr x8,[x26, #0x28]
00b9a868	mov x23,x4
00b9a86c	mov w24,w3
00b9a870	mov x3,x2
00b9a874	str x8,[sp, #0x38]
00b9a878	str xzr,[sp, #0x30]
00b9a87c	ldrh w8,[x0, #0x2]
00b9a880	ldrh w0,[x0]
00b9a884	mov x2,x1
00b9a888	add x4,sp,#0x30
00b9a88c	mov x1,x8
00b9a890	mov x25,x7
00b9a894	mov x20,x6
00b9a898	mov x22,x5
00b9a89c	bl 0x00c42f80
00b9a8a0	cbnz w0,0x00b9aa04
00b9a8a4	ldr x19,[sp, #0x30]
00b9a8a8	add x0,sp,#0x20
00b9a8ac	ldr x8,[x19, #0x78]
00b9a8b0	add x8,x8,#0x7
00b9a8b4	lsr x21,x8,#0x3
00b9a8b8	bl 0x00c41c00
00b9a8bc	add x0,sp,#0x10
00b9a8c0	bl 0x00c41c00
00b9a8c4	lsl x27,x21,#0x1
00b9a8c8	cmp x27,x25
00b9a8cc	b.ls 0x00b9a8d8
00b9a8d0	mov w22,#0xffffb100
00b9a8d4	b 0x00b9a9d0
00b9a8d8	tbnz w24,#0x8,0x00b9a910
00b9a8dc	adrp x6,0xcb5000
00b9a8e0	ldr x6,[x6, #0xac0]
00b9a8e4	add x3,x19,#0xc0
00b9a8e8	add x1,sp,#0x20
00b9a8ec	add x2,sp,#0x10
00b9a8f0	mov x0,x19
00b9a8f4	mov x4,x23
00b9a8f8	mov x5,x22
00b9a8fc	mov x7,xzr
00b9a900	bl 0x00c42510
00b9a904	mov w22,w0
00b9a908	cbnz w0,0x00b9a9d0
00b9a90c	b 0x00b9a9a4
00b9a910	mov w9,#0x8ff
00b9a914	and w8,w24,#0xffffff00
00b9a918	movk w9,#0x600, LSL #16
00b9a91c	cmp w8,w9
00b9a920	b.gt 0x00b9a93c
00b9a924	mov w9,#0x200
00b9a928	movk w9,#0x600, LSL #16
00b9a92c	cmp w8,w9
00b9a930	b.eq 0x00b9a970
00b9a934	mov w9,#0x300
00b9a938	b 0x00b9a950
00b9a93c	mov w9,#0x900
00b9a940	movk w9,#0x600, LSL #16
00b9a944	cmp w8,w9
00b9a948	b.eq 0x00b9a970
00b9a94c	mov w9,#0x1300
00b9a950	movk w9,#0x600, LSL #16
00b9a954	cmp w8,w9
00b9a958	b.eq 0x00b9a970
00b9a95c	lsr w8,w24,#0x9
00b9a960	orr w8,w8,#0x1
00b9a964	orr w9,wzr,#0x30003
00b9a968	cmp w8,w9
00b9a96c	b.ne 0x00b9aa34
00b9a970	and w6,w24,#0xff
00b9a974	adrp x7,0xcb5000
00b9a978	ldr x7,[x7, #0xac0]
00b9a97c	add x3,x19,#0xc0
00b9a980	add x1,sp,#0x20
00b9a984	add x2,sp,#0x10
00b9a988	mov x0,x19
00b9a98c	mov x4,x23
00b9a990	mov x5,x22
00b9a994	str xzr,[sp]
00b9a998	bl 0x00c42520
00b9a99c	mov w22,w0
00b9a9a0	cbnz w0,0x00b9a9d0
00b9a9a4	add x0,sp,#0x20
00b9a9a8	mov x1,x20
00b9a9ac	mov x2,x21
00b9a9b0	bl 0x00c41d80
00b9a9b4	mov w22,w0
00b9a9b8	cbnz w0,0x00b9a9d0
00b9a9bc	add x1,x20,x21
00b9a9c0	add x0,sp,#0x10
00b9a9c4	mov x2,x21
00b9a9c8	bl 0x00c41d80
00b9a9cc	mov w22,w0
00b9a9d0	add x0,sp,#0x20
00b9a9d4	bl 0x00c41bb0
00b9a9d8	add x0,sp,#0x10
00b9a9dc	bl 0x00c41bb0
00b9a9e0	cbnz w22,0x00b9a9ec
00b9a9e4	ldr x8,[x29, #0x10]
00b9a9e8	str x27,[x8]
00b9a9ec	mov x0,x19
00b9a9f0	bl 0x00c426e0
00b9a9f4	mov x0,x19
00b9a9f8	bl 0x00c30960
00b9a9fc	mov w0,w22
00b9aa00	bl 0x00c42bf0
00b9aa04	ldr x8,[x26, #0x28]
00b9aa08	ldr x9,[sp, #0x38]
00b9aa0c	cmp x8,x9
00b9aa10	b.ne 0x00b9aa3c
00b9aa14	ldp x29,x30,[sp, #0x90]
00b9aa18	ldp x20,x19,[sp, #0x80]
00b9aa1c	ldp x22,x21,[sp, #0x70]
00b9aa20	ldp x24,x23,[sp, #0x60]
00b9aa24	ldp x26,x25,[sp, #0x50]
00b9aa28	ldr x27,[sp, #0x40]
00b9aa2c	add sp,sp,#0xa0
00b9aa30	ret
00b9aa34	mov w6,wzr
00b9aa38	b 0x00b9a974
00b9aa3c	bl 0x00c2fec0
