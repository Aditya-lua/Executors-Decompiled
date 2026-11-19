; ossl_decode_der_integer @ 00a80894
00a80894	ldr x11,[x0, #0x8]
00a80898	cbz x11,0x00a80934
00a8089c	ldr x10,[x0]
00a808a0	sub x8,x11,#0x1
00a808a4	mov x9,x10
00a808a8	ldrb w12,[x9], #0x1
00a808ac	cmp w12,#0x2
00a808b0	stp x9,x8,[x0]
00a808b4	mov w9,wzr
00a808b8	b.ne 0x00a809a0
00a808bc	cbz x8,0x00a809a0
00a808c0	ldrsb w9,[x10, #0x1]
00a808c4	mov x2,x1
00a808c8	add x8,x10,#0x2
00a808cc	sub x12,x11,#0x2
00a808d0	and x1,x9,#0xff
00a808d4	stp x8,x12,[x0]
00a808d8	tbnz w9,#0x1f,0x00a8093c
00a808dc	subs x11,x12,x1
00a808e0	mov w9,wzr
00a808e4	b.cc 0x00a809a0
00a808e8	add x9,x8,x1
00a808ec	stp x9,x11,[x0]
00a808f0	cbz x1,0x00a80970
00a808f4	ldrsb w9,[x8]
00a808f8	tbnz w9,#0x1f,0x00a809a8
00a808fc	cmp x1,#0x1
00a80900	b.eq 0x00a80910
00a80904	cbnz w9,0x00a80910
00a80908	ldrsb w10,[x8, #0x1]
00a8090c	tbz w10,#0x1f,0x00a809a0
00a80910	stp x29,x30,[sp, #-0x10]!
00a80914	mov x0,x8
00a80918	mov x29,sp
00a8091c	bl 0x00c36970
00a80920	cmp x0,#0x0
00a80924	cset w9,ne
00a80928	ldp x29,x30,[sp], #0x10
00a8092c	mov w0,w9
00a80930	ret
00a80934	mov w0,wzr
00a80938	ret
00a8093c	cmp w1,#0x82
00a80940	b.eq 0x00a80978
00a80944	cmp w1,#0x81
00a80948	mov w9,wzr
00a8094c	b.ne 0x00a809a0
00a80950	cbz x12,0x00a809b0
00a80954	ldrb w1,[x10, #0x2]
00a80958	sub x8,x11,#0x3
00a8095c	mov w9,wzr
00a80960	subs x11,x8,x1
00a80964	b.cc 0x00a809a0
00a80968	add x8,x10,#0x3
00a8096c	b 0x00a808e8
00a80970	mov w0,wzr
00a80974	ret
00a80978	cmp x12,#0x2
00a8097c	mov w9,wzr
00a80980	b.cc 0x00a809a0
00a80984	ldrb w8,[x10, #0x2]
00a80988	ldrb w1,[x10, #0x3]
00a8098c	mov w9,wzr
00a80990	bfm x1,x8,#0x38,#0x7
00a80994	sub x8,x11,#0x4
00a80998	subs x11,x8,x1
00a8099c	b.cs 0x00a809b8
00a809a0	mov w0,w9
00a809a4	ret
00a809a8	mov w0,wzr
00a809ac	ret
00a809b0	mov w0,wzr
00a809b4	ret
00a809b8	add x8,x10,#0x4
00a809bc	b 0x00a808e8
