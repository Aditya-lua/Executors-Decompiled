; ossl_ffc_params_FIPS186_4_gen_verify @ 00a7d8b0
00a7d8b0	sub sp,sp,#0x180
00a7d8b4	stp x28,x27,[sp, #0x120]
00a7d8b8	stp x26,x25,[sp, #0x130]
00a7d8bc	stp x24,x23,[sp, #0x140]
00a7d8c0	stp x22,x21,[sp, #0x150]
00a7d8c4	stp x20,x19,[sp, #0x160]
00a7d8c8	stp x29,x30,[sp, #0x170]
00a7d8cc	add x29,sp,#0x170
00a7d8d0	mov x27,x7
00a7d8d4	mov x25,x6
00a7d8d8	mov x23,x5
00a7d8dc	mov x28,x4
00a7d8e0	mov w21,w3
00a7d8e4	mov w26,w2
00a7d8e8	mov x19,x1
00a7d8ec	mov x22,x0
00a7d8f0	mov w24,wzr
00a7d8f4	stur xzr,[x29, #-0xa0]
00a7d8f8	cbnz w2,0x00a7d900
00a7d8fc	ldr w24,[x19, #0x40]
00a7d900	str wzr,[x25]
00a7d904	ldr x1,[x19, #0x48]
00a7d908	cbz x1,0x00a7d9b0
00a7d90c	ldr x2,[x19, #0x50]
00a7d910	mov x0,x22
00a7d914	bl 0x00c357f0
00a7d918	mov x20,x0
00a7d91c	cbz x0,0x00a7dafc
00a7d920	mov x0,x20
00a7d924	stur w24,[x29, #-0xa4]
00a7d928	bl 0x00c34c20
00a7d92c	mov w24,w0
00a7d930	cmp w0,#0x1
00a7d934	b.lt 0x00a7dafc
00a7d938	lsl w8,w24,#0x3
00a7d93c	stur x27,[x29, #-0xb0]
00a7d940	sxtw x27,w8
00a7d944	cmp x23,#0x0
00a7d948	csel x23,x27,x23,eq
00a7d94c	cmp x23,x28
00a7d950	b.cs 0x00a7db94
00a7d954	cbz w21,0x00a7da20
00a7d958	cmp w21,#0x1
00a7d95c	b.ne 0x00a7db94
00a7d960	cmp x28,#0x400
00a7d964	b.ne 0x00a7d970
00a7d968	cmp x23,#0xa0
00a7d96c	b.eq 0x00a7da50
00a7d970	cmp x28,#0x800
00a7d974	b.ne 0x00a7d988
00a7d978	cmp x23,#0xe0
00a7d97c	b.eq 0x00a7da50
00a7d980	cmp x23,#0x100
00a7d984	b.eq 0x00a7da50
00a7d988	bl 0x00c342a0
00a7d98c	adrp x0,0x2b2000
00a7d990	adrp x2,0x2d9000
00a7d994	add x0,x0,#0x2b8
00a7d998	add x2,x2,#0xd99
00a7d99c	mov w1,#0x4d
00a7d9a0	bl 0x00c342b0
00a7d9a4	mov w0,#0x5
00a7d9a8	orr w1,wzr,#0x7f
00a7d9ac	b 0x00a7db8c
00a7d9b0	cmp x28,#0x7ff
00a7d9b4	mov w8,#0xa0
00a7d9b8	mov w9,#0x100
00a7d9bc	csel x8,x9,x8,hi
00a7d9c0	cmp x23,#0x0
00a7d9c4	csel x23,x8,x23,eq
00a7d9c8	cmp x23,#0xa0
00a7d9cc	b.eq 0x00a7d9ec
00a7d9d0	cmp x23,#0x100
00a7d9d4	b.eq 0x00a7d9f8
00a7d9d8	cmp x23,#0xe0
00a7d9dc	b.ne 0x00a7da04
00a7d9e0	adrp x1,0x2b9000
00a7d9e4	add x1,x1,#0xf7b
00a7d9e8	b 0x00a7d90c
00a7d9ec	adrp x1,0x2d1000
00a7d9f0	add x1,x1,#0x42e
00a7d9f4	b 0x00a7d90c
00a7d9f8	adrp x1,0x2b1000
00a7d9fc	add x1,x1,#0x8bd
00a7da00	b 0x00a7d90c
00a7da04	mov w8,#0x20
00a7da08	mov x28,xzr
00a7da0c	mov x24,xzr
00a7da10	mov x22,xzr
00a7da14	mov x27,xzr
00a7da18	mov x20,xzr
00a7da1c	b 0x00a7dba8
00a7da20	cmp x28,#0xc00
00a7da24	b.cc 0x00a7da30
00a7da28	cmp x23,#0xff
00a7da2c	b.hi 0x00a7da50
00a7da30	cmp x28,#0x800
00a7da34	b.cc 0x00a7da40
00a7da38	cmp x23,#0xdf
00a7da3c	b.hi 0x00a7da50
00a7da40	cmp x28,#0x400
00a7da44	b.cc 0x00a7db68
00a7da48	cmp x23,#0x9f
00a7da4c	b.ls 0x00a7db68
00a7da50	bl 0x00c31fa0
00a7da54	str x0,[sp, #0xb8]
00a7da58	cbz x0,0x00a7dafc
00a7da5c	mov x0,x22
00a7da60	bl 0x00c38a60
00a7da64	mov x22,x0
00a7da68	cbz x0,0x00a7db18
00a7da6c	mov x0,x22
00a7da70	bl 0x00c38a90
00a7da74	mov x0,x22
00a7da78	bl 0x00c38a40
00a7da7c	mov x21,x0
00a7da80	mov x0,x22
00a7da84	bl 0x00c38a40
00a7da88	str x0,[sp, #0xb0]
00a7da8c	mov x0,x22
00a7da90	bl 0x00c38a40
00a7da94	str x0,[sp, #0xa8]
00a7da98	mov x0,x22
00a7da9c	bl 0x00c38a40
00a7daa0	str x0,[sp, #0xa0]
00a7daa4	mov x0,x22
00a7daa8	bl 0x00c38a40
00a7daac	cbz x0,0x00a7db18
00a7dab0	str x21,[sp, #0x98]
00a7dab4	ldp x21,x8,[x19, #0x20]
00a7dab8	sxtw x9,w24
00a7dabc	cmp x8,#0x0
00a7dac0	csel x24,x9,x8,eq
00a7dac4	cbz w26,0x00a7db30
00a7dac8	ldp x8,x9,[x19]
00a7dacc	cmp x8,#0x0
00a7dad0	cset w8,eq
00a7dad4	cmp x9,#0x0
00a7dad8	cset w9,eq
00a7dadc	eor w8,w8,w9
00a7dae0	ldur w9,[x29, #-0xa4]
00a7dae4	tbz w8,#0x0,0x00a7dc38
00a7dae8	mov x28,xzr
00a7daec	mov x24,xzr
00a7daf0	mov w26,wzr
00a7daf4	mov w8,#0x800
00a7daf8	b 0x00a7de5c
00a7dafc	mov x28,xzr
00a7db00	mov x24,xzr
00a7db04	mov x22,xzr
00a7db08	mov x27,xzr
00a7db0c	mov x21,xzr
00a7db10	mov w26,wzr
00a7db14	b 0x00a7dbb4
00a7db18	mov x28,xzr
00a7db1c	mov x24,xzr
00a7db20	mov x21,xzr
00a7db24	ldr x27,[sp, #0xb8]
00a7db28	mov w26,wzr
00a7db2c	b 0x00a7dbb4
00a7db30	ldur w9,[x29, #-0xa4]
00a7db34	tbz w9,#0x0,0x00a7db44
00a7db38	cbz x21,0x00a7de4c
00a7db3c	ldr w8,[x19, #0x30]
00a7db40	tbnz w8,#0x1f,0x00a7de4c
00a7db44	and w8,w9,#0x1
00a7db48	tbz w9,#0x1,0x00a7dc3c
00a7db4c	ldr x9,[x19, #0x10]
00a7db50	cbnz x9,0x00a7dc3c
00a7db54	mov x28,xzr
00a7db58	mov x24,xzr
00a7db5c	mov w26,wzr
00a7db60	mov w8,#0x400
00a7db64	b 0x00a7de5c
00a7db68	bl 0x00c342a0
00a7db6c	adrp x0,0x2b2000
00a7db70	adrp x2,0x2d9000
00a7db74	add x0,x0,#0x2b8
00a7db78	add x2,x2,#0xd99
00a7db7c	mov w1,#0x57
00a7db80	bl 0x00c342b0
00a7db84	mov w0,#0xa
00a7db88	mov w1,#0x72
00a7db8c	mov x2,xzr
00a7db90	bl 0x00c342c0
00a7db94	mov w8,#0x20000
00a7db98	mov x28,xzr
00a7db9c	mov x24,xzr
00a7dba0	mov x22,xzr
00a7dba4	mov x27,xzr
00a7dba8	mov x21,xzr
00a7dbac	mov w26,wzr
00a7dbb0	str w8,[x25]
00a7dbb4	ldr x8,[x19, #0x20]
00a7dbb8	cmp x21,x8
00a7dbbc	b.eq 0x00a7dbd4
00a7dbc0	adrp x1,0x2b2000
00a7dbc4	add x1,x1,#0x2b8
00a7dbc8	mov w2,#0x31a
00a7dbcc	mov x0,x21
00a7dbd0	bl 0x00c32310
00a7dbd4	adrp x1,0x2b2000
00a7dbd8	add x1,x1,#0x2b8
00a7dbdc	mov w2,#0x31b
00a7dbe0	mov x0,x24
00a7dbe4	bl 0x00c32310
00a7dbe8	cbz x22,0x00a7dbf4
00a7dbec	mov x0,x22
00a7dbf0	bl 0x00c38a20
00a7dbf4	mov x0,x22
00a7dbf8	bl 0x00c38a30
00a7dbfc	mov x0,x28
00a7dc00	bl 0x00c38f70
00a7dc04	mov x0,x27
00a7dc08	bl 0x00c31f90
00a7dc0c	mov x0,x20
00a7dc10	bl 0x00c35800
00a7dc14	mov w0,w26
00a7dc18	ldp x29,x30,[sp, #0x170]
00a7dc1c	ldp x20,x19,[sp, #0x160]
00a7dc20	ldp x22,x21,[sp, #0x150]
00a7dc24	ldp x24,x23,[sp, #0x140]
00a7dc28	ldp x26,x25,[sp, #0x130]
00a7dc2c	ldp x28,x27,[sp, #0x120]
00a7dc30	add sp,sp,#0x180
00a7dc34	ret
00a7dc38	and w8,w9,#0x1
00a7dc3c	str x0,[sp, #0x80]
00a7dc40	cbnz w8,0x00a7de10
00a7dc44	ldr x8,[x19]
00a7dc48	cbz x8,0x00a7de10
00a7dc4c	ldr x23,[x19, #0x8]
00a7dc50	str x8,[sp, #0x90]
00a7dc54	str x24,[sp, #0x78]
00a7dc58	mov x24,xzr
00a7dc5c	bl 0x00c38f80
00a7dc60	ldr x27,[sp, #0xb8]
00a7dc64	mov x28,x0
00a7dc68	cbz x0,0x00a7e230
00a7dc6c	ldr x1,[sp, #0x90]
00a7dc70	mov x0,x28
00a7dc74	mov x2,x22
00a7dc78	bl 0x00c38f90
00a7dc7c	cbz w0,0x00a7e230
00a7dc80	ldur w8,[x29, #-0xa4]
00a7dc84	tbz w8,#0x1,0x00a7dcac
00a7dc88	ldr x4,[x19, #0x10]
00a7dc8c	ldr x2,[sp, #0x90]
00a7dc90	ldr x5,[sp, #0x80]
00a7dc94	mov x0,x22
00a7dc98	mov x1,x28
00a7dc9c	mov x3,x23
00a7dca0	mov x6,x25
00a7dca4	bl 0x00c3dd20
00a7dca8	cbz w0,0x00a7e230
00a7dcac	str x23,[sp, #0x88]
00a7dcb0	bl 0x00c38de0
00a7dcb4	ldr x23,[sp, #0xb0]
00a7dcb8	ldr x1,[sp, #0x90]
00a7dcbc	mov x2,x0
00a7dcc0	mov x0,x23
00a7dcc4	bl 0x00c38880
00a7dcc8	cbz w0,0x00a7e230
00a7dccc	ldr x0,[sp, #0xa8]
00a7dcd0	ldr x3,[sp, #0x88]
00a7dcd4	mov x1,xzr
00a7dcd8	mov x2,x23
00a7dcdc	mov x4,x22
00a7dce0	bl 0x00c38ab0
00a7dce4	cbz w0,0x00a7e230
00a7dce8	cbz x21,0x00a7dea8
00a7dcec	ldr w8,[x19, #0x38]
00a7dcf0	cmn w8,#0x1
00a7dcf4	str w8,[sp, #0xa0]
00a7dcf8	b.eq 0x00a7dea8
00a7dcfc	mov x0,x20
00a7dd00	bl 0x00c34c20
00a7dd04	cmp w0,#0x1
00a7dd08	str w0,[sp, #0x70]
00a7dd0c	b.lt 0x00a7e264
00a7dd10	bl 0x00c31fa0
00a7dd14	cbz x0,0x00a7e264
00a7dd18	mov x23,x0
00a7dd1c	mov w27,#0x1
00a7dd20	str x0,[sp, #0x68]
00a7dd24	ldr w8,[sp, #0xa0]
00a7dd28	mov x0,x23
00a7dd2c	mov x1,x20
00a7dd30	mov x2,xzr
00a7dd34	sturb w8,[x29, #-0x98]
00a7dd38	lsr w8,w27,#0x8
00a7dd3c	sturb w8,[x29, #-0x97]
00a7dd40	sturb w27,[x29, #-0x96]
00a7dd44	bl 0x00c31f70
00a7dd48	cbz w0,0x00a7de08
00a7dd4c	ldr x2,[sp, #0x78]
00a7dd50	mov x0,x23
00a7dd54	mov x1,x21
00a7dd58	bl 0x00c31f80
00a7dd5c	cbz w0,0x00a7de08
00a7dd60	adrp x1,0x766000
00a7dd64	mov w2,#0x4
00a7dd68	mov x0,x23
00a7dd6c	add x1,x1,#0xb70
00a7dd70	bl 0x00c31f80
00a7dd74	cbz w0,0x00a7de08
00a7dd78	sub x1,x29,#0x98
00a7dd7c	orr w2,wzr,#0x3
00a7dd80	mov x0,x23
00a7dd84	bl 0x00c31f80
00a7dd88	cbz w0,0x00a7de08
00a7dd8c	sub x1,x29,#0x98
00a7dd90	mov x0,x23
00a7dd94	mov x2,xzr
00a7dd98	str w27,[sp, #0xb0]
00a7dd9c	bl 0x00c31f60
00a7dda0	cbz w0,0x00a7de08
00a7dda4	ldr x27,[sp, #0x80]
00a7dda8	ldr w1,[sp, #0x70]
00a7ddac	sub x0,x29,#0x98
00a7ddb0	mov x2,x27
00a7ddb4	bl 0x00c36970
00a7ddb8	cbz x0,0x00a7e258
00a7ddbc	ldp x3,x23,[sp, #0x90]
00a7ddc0	ldr x2,[sp, #0xa8]
00a7ddc4	mov x1,x27
00a7ddc8	mov x4,x22
00a7ddcc	mov x0,x23
00a7ddd0	mov x5,x28
00a7ddd4	bl 0x00c38ae0
00a7ddd8	cbz w0,0x00a7e258
00a7dddc	bl 0x00c38de0
00a7dde0	mov x1,x0
00a7dde4	mov x0,x23
00a7dde8	bl 0x00c38cc0
00a7ddec	ldr w27,[sp, #0xb0]
00a7ddf0	cmp w0,#0x0
00a7ddf4	b.gt 0x00a7e26c
00a7ddf8	ldr x23,[sp, #0x68]
00a7ddfc	add w27,w27,#0x1
00a7de00	lsr w8,w27,#0x10
00a7de04	cbz w8,0x00a7dd24
00a7de08	mov x0,x23
00a7de0c	b 0x00a7e25c
00a7de10	mov x0,x22
00a7de14	bl 0x00c38a40
00a7de18	str x0,[sp, #0x90]
00a7de1c	mov x0,x22
00a7de20	bl 0x00c38a40
00a7de24	str x0,[sp, #0x88]
00a7de28	cbz x0,0x00a7de64
00a7de2c	lsl x8,x24,#0x3
00a7de30	cmp x8,x23
00a7de34	b.cs 0x00a7de70
00a7de38	mov x28,xzr
00a7de3c	mov x24,xzr
00a7de40	mov w26,wzr
00a7de44	mov w8,#0x40000
00a7de48	b 0x00a7de5c
00a7de4c	mov x28,xzr
00a7de50	mov x24,xzr
00a7de54	mov w26,wzr
00a7de58	mov w8,#0x200
00a7de5c	ldr x27,[sp, #0xb8]
00a7de60	b 0x00a7dbb0
00a7de64	mov x28,xzr
00a7de68	mov x24,xzr
00a7de6c	b 0x00a7db24
00a7de70	adrp x1,0x2b2000
00a7de74	add x1,x1,#0x2b8
00a7de78	mov w2,#0x283
00a7de7c	mov x0,x24
00a7de80	str x24,[sp, #0x78]
00a7de84	bl 0x00c32320
00a7de88	mov x24,x0
00a7de8c	cbz x0,0x00a7e30c
00a7de90	cbz x21,0x00a7ded4
00a7de94	lsl w8,w28,#0x2
00a7de98	sub w9,w8,#0x1
00a7de9c	cbz w26,0x00a7df00
00a7dea0	str w9,[sp, #0x2c]
00a7dea4	b 0x00a7df20
00a7dea8	cbz w26,0x00a7e158
00a7deac	ldp x4,x2,[sp, #0x90]
00a7deb0	ldr x3,[sp, #0x80]
00a7deb4	ldp x5,x6,[sp, #0xa8]
00a7deb8	sub x7,x29,#0xa0
00a7debc	mov x0,x22
00a7dec0	mov x1,x28
00a7dec4	bl 0x00a7e5fc
00a7dec8	mov w23,wzr
00a7decc	cbnz w0,0x00a7e15c
00a7ded0	b 0x00a7e230
00a7ded4	cbz w26,0x00a7e238
00a7ded8	ldr x0,[sp, #0x78]
00a7dedc	adrp x1,0x2b2000
00a7dee0	add x1,x1,#0x2b8
00a7dee4	mov w2,#0x28e
00a7dee8	bl 0x00c32320
00a7deec	mov x21,x0
00a7def0	cbz x0,0x00a7e30c
00a7def4	lsl w8,w28,#0x2
00a7def8	sub w8,w8,#0x1
00a7defc	b 0x00a7df1c
00a7df00	ldr w8,[x19, #0x30]
00a7df04	cmp w8,w9
00a7df08	b.le 0x00a7df1c
00a7df0c	mov x28,xzr
00a7df10	mov w26,wzr
00a7df14	mov w8,#0x1000
00a7df18	b 0x00a7de5c
00a7df1c	str w8,[sp, #0x2c]
00a7df20	sub x8,x28,#0x1
00a7df24	str x8,[sp, #0x68]
00a7df28	bl 0x00c38de0
00a7df2c	mov x1,x0
00a7df30	ldr x0,[sp, #0xa0]
00a7df34	ldr x2,[sp, #0x68]
00a7df38	bl 0x00c38fc0
00a7df3c	cbz w0,0x00a7e30c
00a7df40	ldr x9,[sp, #0x68]
00a7df44	ldr x10,[x19, #0x20]
00a7df48	mov x8,xzr
00a7df4c	lsr x23,x23,#0x3
00a7df50	udiv x9,x9,x27
00a7df54	str x9,[sp, #0x20]
00a7df58	orr x9,xzr,#-0x100000000
00a7df5c	sub x8,x8,w23, SXTW 
00a7df60	stp x8,x10,[sp, #0x38]
00a7df64	add x8,x9,x23, LSL #0x20
00a7df68	asr x8,x8,#0x20
00a7df6c	str wzr,[sp, #0xa0]
00a7df70	str x8,[sp, #0x30]
00a7df74	str x23,[sp, #0x70]
00a7df78	mov x0,x20
00a7df7c	bl 0x00c34c20
00a7df80	mov w27,w0
00a7df84	mov x0,x22
00a7df88	bl 0x00c38aa0
00a7df8c	ldr x11,[sp, #0x38]
00a7df90	sub x10,x29,#0x98
00a7df94	add x9,x10,w27, SXTW 
00a7df98	sub w8,w23,w27
00a7df9c	str w27,[sp, #0x68]
00a7dfa0	cmp w27,w23
00a7dfa4	ldr x23,[sp, #0x30]
00a7dfa8	ldr x27,[sp, #0x40]
00a7dfac	stp x9,x0,[sp, #0x50]
00a7dfb0	add x9,x9,x11
00a7dfb4	sxtw x8,w8
00a7dfb8	str x8,[sp, #0x48]
00a7dfbc	csel x8,x9,x10,gt
00a7dfc0	str x8,[sp, #0x60]
00a7dfc4	ldur x0,[x29, #-0xb0]
00a7dfc8	ldr w2,[sp, #0xa0]
00a7dfcc	mov w1,wzr
00a7dfd0	bl 0x00c39100
00a7dfd4	cbz w0,0x00a7e30c
00a7dfd8	cmp x21,x27
00a7dfdc	b.eq 0x00a7dffc
00a7dfe0	ldr x0,[sp, #0x58]
00a7dfe4	ldr x2,[sp, #0x78]
00a7dfe8	mov x1,x21
00a7dfec	mov w3,wzr
00a7dff0	bl 0x00c347b0
00a7dff4	cmp w0,#0x1
00a7dff8	b.lt 0x00a7e30c
00a7dffc	ldr x1,[sp, #0x78]
00a7e000	sub x2,x29,#0x98
00a7e004	mov x0,x21
00a7e008	mov x3,xzr
00a7e00c	mov x4,x20
00a7e010	mov x5,xzr
00a7e014	bl 0x00c370c0
00a7e018	cbz w0,0x00a7e30c
00a7e01c	ldr x1,[sp, #0x70]
00a7e020	ldr w8,[sp, #0x68]
00a7e024	cmp w8,w1
00a7e028	b.ge 0x00a7e03c
00a7e02c	ldp x2,x0,[sp, #0x48]
00a7e030	mov w1,wzr
00a7e034	bl 0x00c301c0
00a7e038	ldr x1,[sp, #0x70]
00a7e03c	ldr x0,[sp, #0x60]
00a7e040	ldr x2,[sp, #0x88]
00a7e044	ldrb w8,[x0]
00a7e048	orr w8,w8,#0x80
00a7e04c	strb w8,[x0]
00a7e050	ldrb w8,[x0, x23]
00a7e054	orr w8,w8,#0x1
00a7e058	strb w8,[x0, x23]
00a7e05c	bl 0x00c36970
00a7e060	cbz x0,0x00a7e30c
00a7e064	ldr x0,[sp, #0x88]
00a7e068	ldur x2,[x29, #-0xb0]
00a7e06c	mov x1,x22
00a7e070	bl 0x00c39110
00a7e074	cmp w0,#0x0
00a7e078	b.gt 0x00a7e098
00a7e07c	cmp x21,x27
00a7e080	b.eq 0x00a7e244
00a7e084	ldr w8,[sp, #0xa0]
00a7e088	add w8,w8,#0x1
00a7e08c	str w8,[sp, #0xa0]
00a7e090	cbz w0,0x00a7dfc4
00a7e094	b 0x00a7e30c
00a7e098	cbnz w26,0x00a7e0ac
00a7e09c	ldr x1,[x19, #0x8]
00a7e0a0	ldr x0,[sp, #0x88]
00a7e0a4	bl 0x00c38cc0
00a7e0a8	cbnz w0,0x00a7e2dc
00a7e0ac	ldur x23,[x29, #-0xb0]
00a7e0b0	mov w1,#0x2
00a7e0b4	mov w2,wzr
00a7e0b8	mov x0,x23
00a7e0bc	bl 0x00c39100
00a7e0c0	cbz w0,0x00a7e30c
00a7e0c4	orr w1,wzr,#0x3
00a7e0c8	mov x0,x23
00a7e0cc	mov w2,wzr
00a7e0d0	bl 0x00c39100
00a7e0d4	cbz w0,0x00a7e30c
00a7e0d8	ldr x27,[sp, #0x78]
00a7e0dc	mov x0,x24
00a7e0e0	mov x1,x21
00a7e0e4	mov x2,x27
00a7e0e8	bl 0x00c2ffd0
00a7e0ec	ldr w2,[sp, #0x2c]
00a7e0f0	ldr x3,[sp, #0x20]
00a7e0f4	ldp x6,x7,[sp, #0x88]
00a7e0f8	sub x8,x29,#0x9c
00a7e0fc	mov x0,x22
00a7e100	mov x1,x20
00a7e104	mov x4,x24
00a7e108	mov x5,x27
00a7e10c	str x23,[sp, #0x8]
00a7e110	stp x8,x25,[sp, #0x10]
00a7e114	str w28,[sp]
00a7e118	bl 0x00a7e31c
00a7e11c	cmp w0,#0x0
00a7e120	b.gt 0x00a7e2a0
00a7e124	tbnz w0,#0x1f,0x00a7e30c
00a7e128	ldr x8,[x19, #0x20]
00a7e12c	ldr x23,[sp, #0x70]
00a7e130	str x8,[sp, #0x40]
00a7e134	cmp x21,x8
00a7e138	ldr w8,[sp, #0xa0]
00a7e13c	add w8,w8,#0x1
00a7e140	str w8,[sp, #0xa0]
00a7e144	b.ne 0x00a7df78
00a7e148	mov x28,xzr
00a7e14c	mov w26,wzr
00a7e150	mov w8,#0x1
00a7e154	b 0x00a7de5c
00a7e158	mov w23,wzr
00a7e15c	ldur x0,[x29, #-0xb0]
00a7e160	orr w1,wzr,#0x3
00a7e164	mov w2,#0x1
00a7e168	bl 0x00c39100
00a7e16c	cbz w0,0x00a7e230
00a7e170	ldur w8,[x29, #-0xa4]
00a7e174	and w25,w8,#0x2
00a7e178	cbz w26,0x00a7e21c
00a7e17c	ldr x0,[x19]
00a7e180	ldr x26,[sp, #0x90]
00a7e184	cmp x26,x0
00a7e188	b.eq 0x00a7e19c
00a7e18c	bl 0x00c36290
00a7e190	mov x0,x26
00a7e194	bl 0x00c369a0
00a7e198	str x0,[x19]
00a7e19c	ldr x0,[x19, #0x8]
00a7e1a0	ldr x26,[sp, #0x88]
00a7e1a4	cmp x26,x0
00a7e1a8	b.eq 0x00a7e1bc
00a7e1ac	bl 0x00c36290
00a7e1b0	mov x0,x26
00a7e1b4	bl 0x00c369a0
00a7e1b8	str x0,[x19, #0x8]
00a7e1bc	ldr x0,[x19, #0x10]
00a7e1c0	ldr x8,[sp, #0x98]
00a7e1c4	cmp x8,x0
00a7e1c8	b.eq 0x00a7e1e0
00a7e1cc	bl 0x00c36290
00a7e1d0	ldr x0,[sp, #0x98]
00a7e1d4	bl 0x00c369a0
00a7e1d8	str x0,[sp, #0x98]
00a7e1dc	str x0,[x19, #0x10]
00a7e1e0	ldr x8,[x19]
00a7e1e4	cbz x8,0x00a7e230
00a7e1e8	ldr x8,[x19, #0x8]
00a7e1ec	cbz x8,0x00a7db24
00a7e1f0	ldr x8,[sp, #0x98]
00a7e1f4	cbz x8,0x00a7db24
00a7e1f8	ldur w3,[x29, #-0x9c]
00a7e1fc	ldr x2,[sp, #0x78]
00a7e200	mov x0,x19
00a7e204	mov x1,x21
00a7e208	bl 0x00c39cf0
00a7e20c	cbz w0,0x00a7db24
00a7e210	ldur w8,[x29, #-0xa0]
00a7e214	str w8,[x19, #0x3c]
00a7e218	ldr x27,[sp, #0xb8]
00a7e21c	cmp w23,#0x0
00a7e220	ccmp w25,#0x0,#0x4,eq
00a7e224	mov w8,#0x1
00a7e228	cinc w26,w8,ne
00a7e22c	b 0x00a7dbb4
00a7e230	mov w26,wzr
00a7e234	b 0x00a7dbb4
00a7e238	mov x28,xzr
00a7e23c	mov x21,xzr
00a7e240	b 0x00a7de58
00a7e244	ldr w8,[x25]
00a7e248	mov x28,xzr
00a7e24c	orr w8,w8,#0x10
00a7e250	str w8,[x25]
00a7e254	b 0x00a7db24
00a7e258	ldr x0,[sp, #0x68]
00a7e25c	bl 0x00c31f90
00a7e260	ldr x27,[sp, #0xb8]
00a7e264	mov w8,#0x400
00a7e268	b 0x00a7dbac
00a7e26c	ldr x0,[sp, #0x68]
00a7e270	bl 0x00c31f90
00a7e274	cbz w26,0x00a7e284
00a7e278	ldr x27,[sp, #0xb8]
00a7e27c	mov w23,#0x1
00a7e280	b 0x00a7e15c
00a7e284	ldr x1,[x19, #0x10]
00a7e288	ldr x0,[sp, #0x98]
00a7e28c	bl 0x00c38cc0
00a7e290	cbz w0,0x00a7e278
00a7e294	mov w26,wzr
00a7e298	mov w8,#0x8000
00a7e29c	b 0x00a7de5c
00a7e2a0	ldur x0,[x29, #-0xb0]
00a7e2a4	mov w1,#0x2
00a7e2a8	mov w2,#0x1
00a7e2ac	bl 0x00c39100
00a7e2b0	cbz w0,0x00a7e30c
00a7e2b4	cbz w26,0x00a7e2ec
00a7e2b8	ldur w8,[x29, #-0xa4]
00a7e2bc	and w8,w8,#0x3
00a7e2c0	cmp w8,#0x1
00a7e2c4	b.ne 0x00a7e314
00a7e2c8	ldur w8,[x29, #-0xa4]
00a7e2cc	mov x28,xzr
00a7e2d0	mov w23,wzr
00a7e2d4	and w25,w8,#0x2
00a7e2d8	b 0x00a7e218
00a7e2dc	mov x28,xzr
00a7e2e0	mov w26,wzr
00a7e2e4	mov w8,#0x4000
00a7e2e8	b 0x00a7de5c
00a7e2ec	ldur w8,[x29, #-0x9c]
00a7e2f0	ldr w9,[sp, #0x2c]
00a7e2f4	cmp w8,w9
00a7e2f8	b.ne 0x00a7e30c
00a7e2fc	ldr x1,[x19]
00a7e300	ldr x0,[sp, #0x90]
00a7e304	bl 0x00c38cc0
00a7e308	cbz w0,0x00a7e2b8
00a7e30c	mov x28,xzr
00a7e310	b 0x00a7db24
00a7e314	ldr x23,[sp, #0x88]
00a7e318	b 0x00a7dc5c
