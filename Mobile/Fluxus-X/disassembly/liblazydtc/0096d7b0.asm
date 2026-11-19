; FUN_0096d7b0 @ 0096d7b0
0096d7b0	sub sp,sp,#0x90
0096d7b4	stp x28,x27,[sp, #0x30]
0096d7b8	stp x26,x25,[sp, #0x40]
0096d7bc	stp x24,x23,[sp, #0x50]
0096d7c0	stp x22,x21,[sp, #0x60]
0096d7c4	stp x20,x19,[sp, #0x70]
0096d7c8	stp x29,x30,[sp, #0x80]
0096d7cc	add x29,sp,#0x80
0096d7d0	mov x21,x2
0096d7d4	mov x19,x1
0096d7d8	mov x20,x0
0096d7dc	bl 0x009685c0
0096d7e0	mov x22,x0
0096d7e4	mov x0,x20
0096d7e8	mov x1,x19
0096d7ec	bl 0x009685e4
0096d7f0	ldr w8,[x19, #0x6d8]
0096d7f4	cbz w8,0x0096d840
0096d7f8	ldrb w8,[x22, #0x79]
0096d7fc	mov w23,wzr
0096d800	tbz w8,#0x0,0x0096d844
0096d804	ldr x8,[x22]
0096d808	mov w23,wzr
0096d80c	cbnz x8,0x0096d844
0096d810	ldr x8,[x22, #0x48]
0096d814	mov w23,wzr
0096d818	cbnz x8,0x0096d844
0096d81c	ldr x8,[x0, #0x38]
0096d820	mov w23,wzr
0096d824	cbnz x8,0x0096d844
0096d828	ldrb w8,[x0, #0xc0]
0096d82c	tst w8,#0x40
0096d830	cset w23,eq
0096d834	ldr x8,[x19, #0xc0]
0096d838	cbnz x8,0x0096d84c
0096d83c	b 0x0096d8f0
0096d840	mov w23,wzr
0096d844	ldr x8,[x19, #0xc0]
0096d848	cbz x8,0x0096d8f0
0096d84c	adrp x1,0x2bf000
0096d850	add x0,x8,#0x128
0096d854	add x1,x1,#0x52b
0096d858	mov w2,#0x13
0096d85c	bl 0x009167a8
0096d860	mov x22,x0
0096d864	cbz x0,0x0096d8f0
0096d868	ldr x8,[x22, #0x8]
0096d86c	cbz x8,0x0096d8f0
0096d870	ldr w8,[x19, #0x6d8]
0096d874	tbnz w8,#0x1f,0x0096d898
0096d878	bl 0x00941cb8
0096d87c	ldp x2,x3,[x22, #0x10]
0096d880	bl 0x00941d54
0096d884	ldrsw x8,[x19, #0x6d8]
0096d888	mov w9,#0x3e8
0096d88c	mul x8,x8,x9
0096d890	cmp x0,x8
0096d894	b.ge 0x0096d8f0
0096d898	mov x0,x20
0096d89c	bl 0x009685c0
0096d8a0	mov x8,x0
0096d8a4	ldr x0,[x22]
0096d8a8	ldr x1,[x8, #0x8]
0096d8ac	cbz x0,0x0096d8e8
0096d8b0	cbz x1,0x0096d8e8
0096d8b4	bl 0x00c301f0
0096d8b8	cbnz w0,0x0096d8f0
0096d8bc	ldr x22,[x22, #0x8]
0096d8c0	eor w28,w23,#0x1
0096d8c4	cbz x22,0x0096d8f4
0096d8c8	tbnz w28,#0x0,0x0096d8f4
0096d8cc	mov x0,x22
0096d8d0	bl 0x00c32c60
0096d8d4	cbz w0,0x0096de34
0096d8d8	mov x0,x21
0096d8dc	mov x1,x22
0096d8e0	bl 0x00c32760
0096d8e4	b 0x0096dd6c
0096d8e8	cmp x0,x1
0096d8ec	b.eq 0x0096d8bc
0096d8f0	eor w28,w23,#0x1
0096d8f4	mov x0,x21
0096d8f8	bl 0x00c31a70
0096d8fc	mov x21,x0
0096d900	mov x0,x20
0096d904	bl 0x009685c0
0096d908	mov x26,x0
0096d90c	mov x0,x20
0096d910	mov x1,x19
0096d914	bl 0x009685e4
0096d918	ldr x24,[x26, #0x48]
0096d91c	mov x22,x0
0096d920	mov x25,xzr
0096d924	cbnz x24,0x0096d92c
0096d928	ldr x25,[x26, #0x8]
0096d92c	ldr x2,[x26]
0096d930	ldr x23,[x22, #0x38]
0096d934	ldrb w8,[x19, #0xa85]
0096d938	ldrb w26,[x26, #0x79]
0096d93c	tbz w8,#0x4,0x0096d9a4
0096d940	ldr x8,[x19, #0x12a0]
0096d944	cbz x8,0x0096d95c
0096d948	cbz x20,0x0096d9a4
0096d94c	ldr w8,[x8, #0x8]
0096d950	cmp w8,#0x0
0096d954	b.gt 0x0096d960
0096d958	b 0x0096d9a4
0096d95c	cbz x20,0x0096d9a4
0096d960	ldr x8,[x20]
0096d964	ldr w8,[x8, #0xc]
0096d968	cmp w8,#0x1
0096d96c	b.lt 0x0096d9a4
0096d970	cmp x24,#0x0
0096d974	adrp x8,0x2c6000
0096d978	add x8,x8,#0xe43
0096d97c	cset w4,ne
0096d980	cmp x25,#0x0
0096d984	mov x27,x2
0096d988	adrp x2,0x2c5000
0096d98c	csel x3,x8,x25,eq
0096d990	add x2,x2,#0x320
0096d994	mov x0,x19
0096d998	mov x1,x20
0096d99c	bl 0x00904ddc
0096d9a0	mov x2,x27
0096d9a4	cbz x21,0x0096d9c8
0096d9a8	add x27,x19,#0xa82
0096d9ac	tbz w26,#0x0,0x0096dbcc
0096d9b0	cbz x24,0x0096dafc
0096d9b4	ldr x1,[x24, #0x8]
0096d9b8	lsr x8,x1,#0x1f
0096d9bc	cbz x8,0x0096d9d0
0096d9c0	mov w22,#0x4d
0096d9c4	b 0x0096da84
0096d9c8	mov w22,#0x1b
0096d9cc	b 0x0096de64
0096d9d0	ldr x0,[x24]
0096d9d4	str x2,[sp, #0x28]
0096d9d8	bl 0x00c31a50
0096d9dc	mov x24,x0
0096d9e0	cbz x0,0x0096da80
0096d9e4	mov x0,x24
0096d9e8	mov x1,xzr
0096d9ec	mov x2,xzr
0096d9f0	mov x3,xzr
0096d9f4	str x27,[sp, #0x20]
0096d9f8	str w26,[sp, #0x1c]
0096d9fc	bl 0x00c32630
0096da00	mov x27,x0
0096da04	cbz x0,0x0096dd74
0096da08	mov x0,x27
0096da0c	str x24,[sp, #0x10]
0096da10	str w28,[sp, #0xc]
0096da14	bl 0x00c325e0
0096da18	cmp w0,#0x1
0096da1c	b.lt 0x0096da98
0096da20	mov w24,wzr
0096da24	mov w28,wzr
0096da28	mov x0,x27
0096da2c	mov w1,w28
0096da30	bl 0x00c32610
0096da34	ldr x1,[x0]
0096da38	mov x26,x0
0096da3c	cbz x1,0x0096da50
0096da40	mov x0,x21
0096da44	bl 0x00c31a80
0096da48	cbz w0,0x0096da98
0096da4c	add w24,w24,#0x1
0096da50	ldr x1,[x26, #0x8]
0096da54	cbz x1,0x0096da68
0096da58	mov x0,x21
0096da5c	bl 0x00c32bf0
0096da60	cbz w0,0x0096da98
0096da64	add w24,w24,#0x1
0096da68	mov x0,x27
0096da6c	add w28,w28,#0x1
0096da70	bl 0x00c325e0
0096da74	cmp w28,w0
0096da78	b.lt 0x0096da28
0096da7c	b 0x0096da9c
0096da80	mov w22,#0x1b
0096da84	adrp x1,0x2a3000
0096da88	add x1,x1,#0x95d
0096da8c	mov x0,x19
0096da90	bl 0x00904b80
0096da94	b 0x0096de64
0096da98	mov w24,wzr
0096da9c	adrp x1,0xcb4000
0096daa0	ldr x1,[x1, #0xe80]
0096daa4	mov x0,x27
0096daa8	bl 0x00c32600
0096daac	ldr x0,[sp, #0x10]
0096dab0	bl 0x00c31a40
0096dab4	cmp w24,#0x0
0096dab8	b.le 0x0096d9c0
0096dabc	ldr x27,[sp, #0x20]
0096dac0	ldrb w8,[x27, #0x3]
0096dac4	tbz w8,#0x4,0x0096daec
0096dac8	ldr x8,[x19, #0x12a0]
0096dacc	cbz x8,0x0096dadc
0096dad0	ldr w8,[x8, #0x8]
0096dad4	cmp w8,#0x1
0096dad8	b.lt 0x0096daec
0096dadc	adrp x1,0x2c7000
0096dae0	add x1,x1,#0x31e
0096dae4	mov x0,x19
0096dae8	bl 0x00904c98
0096daec	ldr w28,[sp, #0xc]
0096daf0	ldr w26,[sp, #0x1c]
0096daf4	ldr x2,[sp, #0x28]
0096daf8	mov w24,#0x1
0096dafc	orr x8,x25,x2
0096db00	cbz x8,0x0096dbc0
0096db04	str x2,[sp, #0x28]
0096db08	cbz x25,0x0096db20
0096db0c	mov x0,x21
0096db10	mov x1,x25
0096db14	bl 0x00c32c20
0096db18	ldr x2,[sp, #0x28]
0096db1c	cbz w0,0x0096dd80
0096db20	cbz x2,0x0096db38
0096db24	mov x0,x21
0096db28	mov x1,x2
0096db2c	bl 0x00c32c30
0096db30	ldr x2,[sp, #0x28]
0096db34	cbz w0,0x0096ddf4
0096db38	ldrb w8,[x27, #0x3]
0096db3c	tbz w8,#0x4,0x0096dbcc
0096db40	ldr x8,[x19, #0x12a0]
0096db44	cbz x8,0x0096db54
0096db48	ldr w9,[x8, #0x8]
0096db4c	cmp w9,#0x1
0096db50	b.lt 0x0096db8c
0096db54	adrp x8,0x2c6000
0096db58	add x8,x8,#0xe43
0096db5c	cmp x25,#0x0
0096db60	adrp x1,0x2cd000
0096db64	mov x24,x2
0096db68	csel x2,x25,x8,ne
0096db6c	add x1,x1,#0x2f6
0096db70	mov x0,x19
0096db74	bl 0x00904c98
0096db78	ldrb w8,[x27, #0x3]
0096db7c	tbz w8,#0x4,0x0096dbcc
0096db80	ldr x8,[x19, #0x12a0]
0096db84	mov x2,x24
0096db88	cbz x8,0x0096db98
0096db8c	ldr w8,[x8, #0x8]
0096db90	cmp w8,#0x1
0096db94	b.lt 0x0096dbcc
0096db98	adrp x8,0x2c6000
0096db9c	add x8,x8,#0xe43
0096dba0	cmp x2,#0x0
0096dba4	adrp x1,0x2bb000
0096dba8	csel x2,x2,x8,ne
0096dbac	add x1,x1,#0x4d6
0096dbb0	mov x0,x19
0096dbb4	bl 0x00904c98
0096dbb8	cbnz x23,0x0096dbd0
0096dbbc	b 0x0096dc5c
0096dbc0	tbnz w24,#0x0,0x0096dbcc
0096dbc4	mov x0,x21
0096dbc8	bl 0x00c32c40
0096dbcc	cbz x23,0x0096dc5c
0096dbd0	bl 0x00c32b90
0096dbd4	mov x1,x0
0096dbd8	mov x0,x21
0096dbdc	bl 0x00c32c00
0096dbe0	cbz x0,0x0096dcf8
0096dbe4	mov w2,#0x1
0096dbe8	mov x1,x23
0096dbec	bl 0x00c32d40
0096dbf0	cbz w0,0x0096dcf8
0096dbf4	ldrb w8,[x27, #0x3]
0096dbf8	tbz w8,#0x4,0x0096dc20
0096dbfc	ldr x8,[x19, #0x12a0]
0096dc00	cbz x8,0x0096dc10
0096dc04	ldr w8,[x8, #0x8]
0096dc08	cmp w8,#0x1
0096dc0c	b.lt 0x0096dc20
0096dc10	adrp x1,0x2bf000
0096dc14	add x1,x1,#0x53f
0096dc18	mov x0,x19
0096dc1c	bl 0x00904c98
0096dc20	orr w1,wzr,#0xc
0096dc24	mov x0,x21
0096dc28	bl 0x00c32c50
0096dc2c	ldrb w8,[x27, #0x3]
0096dc30	tbz w8,#0x4,0x0096dc5c
0096dc34	ldr x8,[x19, #0x12a0]
0096dc38	cbz x8,0x0096dc48
0096dc3c	ldr w8,[x8, #0x8]
0096dc40	cmp w8,#0x1
0096dc44	b.lt 0x0096dc5c
0096dc48	adrp x1,0x29d000
0096dc4c	add x1,x1,#0x9f9
0096dc50	mov x0,x19
0096dc54	mov x2,x23
0096dc58	bl 0x00904c98
0096dc5c	tbz w26,#0x0,0x0096dc84
0096dc60	mov w1,#0x8000
0096dc64	mov x0,x21
0096dc68	bl 0x00c32c50
0096dc6c	cbnz x23,0x0096dc84
0096dc70	ldrb w8,[x22, #0xc0]
0096dc74	tbnz w8,#0x4,0x0096dc84
0096dc78	mov w1,#0x80000
0096dc7c	mov x0,x21
0096dc80	bl 0x00c32c50
0096dc84	mov w22,wzr
0096dc88	tbnz w28,#0x0,0x0096de64
0096dc8c	mov x0,x20
0096dc90	bl 0x009685c0
0096dc94	ldr x8,[x19, #0xc0]
0096dc98	mov x20,x0
0096dc9c	cbz x8,0x0096dd6c
0096dca0	add x22,x8,#0x128
0096dca4	adrp x1,0x2bf000
0096dca8	add x1,x1,#0x52b
0096dcac	mov w2,#0x13
0096dcb0	mov x0,x22
0096dcb4	bl 0x009167a8
0096dcb8	mov x19,x0
0096dcbc	cbz x0,0x0096dd14
0096dcc0	mov x0,x21
0096dcc4	bl 0x00c32c60
0096dcc8	cbz w0,0x0096dd6c
0096dccc	ldr x0,[x20, #0x8]
0096dcd0	cbz x0,0x0096ddbc
0096dcd4	adrp x8,0xcc4000
0096dcd8	add x8,x8,#0x688
0096dcdc	ldr x8,[x8]
0096dce0	blr x8
0096dce4	mov x20,x0
0096dce8	cbnz x0,0x0096ddc0
0096dcec	mov x0,x21
0096dcf0	bl 0x00c32c10
0096dcf4	b 0x0096dd6c
0096dcf8	adrp x1,0x2cb000
0096dcfc	add x1,x1,#0x26a
0096dd00	mov x0,x19
0096dd04	mov x2,x23
0096dd08	bl 0x00904b80
0096dd0c	mov w22,#0x52
0096dd10	b 0x0096de64
0096dd14	adrp x8,0xcc4000
0096dd18	add x8,x8,#0x690
0096dd1c	mov w0,#0x1
0096dd20	mov w1,#0x20
0096dd24	ldr x8,[x8]
0096dd28	blr x8
0096dd2c	mov x19,x0
0096dd30	cbz x0,0x0096dd6c
0096dd34	adrp x1,0x2bf000
0096dd38	adrp x4,0x970000
0096dd3c	add x1,x1,#0x52b
0096dd40	add x4,x4,#0xbe8
0096dd44	mov w2,#0x13
0096dd48	mov x0,x22
0096dd4c	mov x3,x19
0096dd50	bl 0x009164f8
0096dd54	cbnz x0,0x0096dcc0
0096dd58	adrp x8,0xcc4000
0096dd5c	add x8,x8,#0x678
0096dd60	mov x0,x19
0096dd64	ldr x8,[x8]
0096dd68	blr x8
0096dd6c	mov w22,wzr
0096dd70	b 0x0096de64
0096dd74	mov x0,x24
0096dd78	bl 0x00c31a40
0096dd7c	b 0x0096d9c0
0096dd80	tbz w24,#0x0,0x0096de3c
0096dd84	ldrb w8,[x27, #0x3]
0096dd88	tbz w8,#0x4,0x0096db20
0096dd8c	ldr x8,[x19, #0x12a0]
0096dd90	cbz x8,0x0096dda0
0096dd94	ldr w8,[x8, #0x8]
0096dd98	cmp w8,#0x1
0096dd9c	b.lt 0x0096db20
0096dda0	adrp x1,0x2a5000
0096dda4	add x1,x1,#0x664
0096dda8	mov x0,x19
0096ddac	bl 0x00904c98
0096ddb0	ldr x2,[sp, #0x28]
0096ddb4	cbnz x2,0x0096db24
0096ddb8	b 0x0096db38
0096ddbc	mov x20,xzr
0096ddc0	ldr x0,[x19, #0x8]
0096ddc4	cbz x0,0x0096dde0
0096ddc8	bl 0x00c32c10
0096ddcc	adrp x8,0xcc4000
0096ddd0	add x8,x8,#0x678
0096ddd4	ldr x0,[x19]
0096ddd8	ldr x8,[x8]
0096dddc	blr x8
0096dde0	bl 0x00941cb8
0096dde4	mov w22,wzr
0096dde8	stp x0,x1,[x19, #0x10]
0096ddec	stp x20,x21,[x19]
0096ddf0	b 0x0096de64
0096ddf4	tbz w24,#0x0,0x0096de50
0096ddf8	ldrb w8,[x27, #0x3]
0096ddfc	tbz w8,#0x4,0x0096db38
0096de00	ldr x8,[x19, #0x12a0]
0096de04	cbz x8,0x0096de14
0096de08	ldr w8,[x8, #0x8]
0096de0c	cmp w8,#0x1
0096de10	b.lt 0x0096db38
0096de14	adrp x1,0x2b7000
0096de18	add x1,x1,#0x295
0096de1c	mov x0,x19
0096de20	bl 0x00904c98
0096de24	ldr x2,[sp, #0x28]
0096de28	ldrb w8,[x27, #0x3]
0096de2c	tbnz w8,#0x4,0x0096db40
0096de30	b 0x0096dbcc
0096de34	mov w28,wzr
0096de38	b 0x0096d8f4
0096de3c	adrp x1,0x2ad000
0096de40	add x1,x1,#0x4d3
0096de44	mov x0,x19
0096de48	mov x2,x25
0096de4c	b 0x0096de5c
0096de50	adrp x1,0x2d7000
0096de54	add x1,x1,#0x677
0096de58	mov x0,x19
0096de5c	bl 0x00904b80
0096de60	mov w22,#0x4d
0096de64	mov w0,w22
0096de68	ldp x29,x30,[sp, #0x80]
0096de6c	ldp x20,x19,[sp, #0x70]
0096de70	ldp x22,x21,[sp, #0x60]
0096de74	ldp x24,x23,[sp, #0x50]
0096de78	ldp x26,x25,[sp, #0x40]
0096de7c	ldp x28,x27,[sp, #0x30]
0096de80	add sp,sp,#0x90
0096de84	ret
