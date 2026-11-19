; ossl_ec_GF2m_simple_cmp @ 00a2a8c8
00a2a8c8	str x27,[sp, #-0x60]!
00a2a8cc	stp x26,x25,[sp, #0x10]
00a2a8d0	stp x24,x23,[sp, #0x20]
00a2a8d4	stp x22,x21,[sp, #0x30]
00a2a8d8	stp x20,x19,[sp, #0x40]
00a2a8dc	stp x29,x30,[sp, #0x50]
00a2a8e0	add x29,sp,#0x50
00a2a8e4	mov x19,x3
00a2a8e8	mov x21,x2
00a2a8ec	mov x22,x1
00a2a8f0	mov x23,x0
00a2a8f4	bl 0x00c3ae10
00a2a8f8	mov w20,w0
00a2a8fc	mov x0,x23
00a2a900	mov x1,x21
00a2a904	bl 0x00c3ae10
00a2a908	cbz w20,0x00a2a918
00a2a90c	cmp w0,#0x0
00a2a910	cset w21,eq
00a2a914	b 0x00a2aa14
00a2a918	cbz w0,0x00a2a924
00a2a91c	mov w21,#0x1
00a2a920	b 0x00a2aa14
00a2a924	ldr w8,[x22, #0x28]
00a2a928	cbz w8,0x00a2a95c
00a2a92c	ldr w8,[x21, #0x28]
00a2a930	cbz w8,0x00a2a95c
00a2a934	ldr x0,[x22, #0x10]
00a2a938	ldr x1,[x21, #0x10]
00a2a93c	bl 0x00c38cc0
00a2a940	cbnz w0,0x00a2a91c
00a2a944	ldr x0,[x22, #0x18]
00a2a948	ldr x1,[x21, #0x18]
00a2a94c	bl 0x00c38cc0
00a2a950	cmp w0,#0x0
00a2a954	cset w21,ne
00a2a958	b 0x00a2aa14
00a2a95c	mov x20,xzr
00a2a960	cbnz x19,0x00a2a974
00a2a964	bl 0x00c38a50
00a2a968	mov x19,x0
00a2a96c	mov x20,x0
00a2a970	cbz x0,0x00a2aa34
00a2a974	mov x0,x19
00a2a978	bl 0x00c38a90
00a2a97c	mov x0,x19
00a2a980	bl 0x00c38a40
00a2a984	mov x25,x0
00a2a988	mov x0,x19
00a2a98c	bl 0x00c38a40
00a2a990	mov x24,x0
00a2a994	mov x0,x19
00a2a998	bl 0x00c38a40
00a2a99c	mov x27,x0
00a2a9a0	mov x0,x19
00a2a9a4	bl 0x00c38a40
00a2a9a8	cbz x0,0x00a2aa00
00a2a9ac	mov x26,x0
00a2a9b0	mov x0,x23
00a2a9b4	mov x1,x22
00a2a9b8	mov x2,x25
00a2a9bc	mov x3,x24
00a2a9c0	mov x4,x19
00a2a9c4	bl 0x00c3ae70
00a2a9c8	cbz w0,0x00a2aa00
00a2a9cc	mov x0,x23
00a2a9d0	mov x1,x21
00a2a9d4	mov x2,x27
00a2a9d8	mov x3,x26
00a2a9dc	mov x4,x19
00a2a9e0	bl 0x00c3ae70
00a2a9e4	cbz w0,0x00a2aa00
00a2a9e8	mov x0,x25
00a2a9ec	mov x1,x27
00a2a9f0	bl 0x00c38cc0
00a2a9f4	cbz w0,0x00a2aa3c
00a2a9f8	mov w21,#0x1
00a2a9fc	b 0x00a2aa04
00a2aa00	mov w21,#0xffffffff
00a2aa04	mov x0,x19
00a2aa08	bl 0x00c38a20
00a2aa0c	mov x0,x20
00a2aa10	bl 0x00c38a30
00a2aa14	mov w0,w21
00a2aa18	ldp x29,x30,[sp, #0x50]
00a2aa1c	ldp x20,x19,[sp, #0x40]
00a2aa20	ldp x22,x21,[sp, #0x30]
00a2aa24	ldp x24,x23,[sp, #0x20]
00a2aa28	ldp x26,x25,[sp, #0x10]
00a2aa2c	ldr x27,[sp], #0x60
00a2aa30	ret
00a2aa34	mov w21,#0xffffffff
00a2aa38	b 0x00a2aa14
00a2aa3c	mov x0,x24
00a2aa40	mov x1,x26
00a2aa44	bl 0x00c38cc0
00a2aa48	cmp w0,#0x0
00a2aa4c	cset w21,ne
00a2aa50	b 0x00a2aa04
