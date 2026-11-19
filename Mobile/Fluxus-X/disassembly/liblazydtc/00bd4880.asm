; std::__ndk1::basic_istream<wchar_t,std::__ndk1::char_traits<wchar_t>>::get @ 00bd4880
00bd4880	paciasp
00bd4884	stp x29,x30,[sp, #-0x40]!
00bd4888	str x23,[sp, #0x10]
00bd488c	stp x22,x21,[sp, #0x20]
00bd4890	stp x20,x19,[sp, #0x30]
00bd4894	mov x29,sp
00bd4898	mov x19,x0
00bd489c	mov w20,w2
00bd48a0	mov x21,x1
00bd48a4	str xzr,[x0, #0x8]
00bd48a8	add x0,x29,#0x1c
00bd48ac	mov x1,x19
00bd48b0	mov w2,#0x1
00bd48b4	bl 0x00c44060
00bd48b8	ldrb w8,[x29, #0x1c]
00bd48bc	cmp w8,#0x1
00bd48c0	b.ne 0x00bd49b8
00bd48c4	add x22,x19,#0x28
00bd48c8	mov x23,#0x7fffffffffffffff
00bd48cc	b 0x00bd48f0
00bd48d0	ldr x8,[x19]
00bd48d4	ldur x8,[x8, #-0x18]
00bd48d8	ldr x0,[x22, x8#0x0]
00bd48dc	ldp x8,x9,[x0, #0x18]
00bd48e0	cmp x8,x9
00bd48e4	b.eq 0x00bd4978
00bd48e8	add x8,x8,#0x4
00bd48ec	str x8,[x0, #0x18]
00bd48f0	ldr x8,[x19]
00bd48f4	ldur x8,[x8, #-0x18]
00bd48f8	ldr x0,[x22, x8#0x0]
00bd48fc	ldp x8,x9,[x0, #0x18]
00bd4900	cmp x8,x9
00bd4904	b.eq 0x00bd4910
00bd4908	ldr w1,[x8]
00bd490c	b 0x00bd4920
00bd4910	ldr x8,[x0]
00bd4914	ldr x8,[x8, #0x48]
00bd4918	blr x8
00bd491c	mov w1,w0
00bd4920	cmn w1,#0x1
00bd4924	b.eq 0x00bd4990
00bd4928	cmp w1,w20
00bd492c	b.eq 0x00bd4988
00bd4930	ldp x8,x9,[x21, #0x30]
00bd4934	cmp x8,x9
00bd4938	b.eq 0x00bd4948
00bd493c	str w1,[x8], #0x4
00bd4940	str x8,[x21, #0x30]
00bd4944	b 0x00bd4960
00bd4948	ldr x8,[x21]
00bd494c	ldr x8,[x8, #0x68]
00bd4950	mov x0,x21
00bd4954	blr x8
00bd4958	cmn w0,#0x1
00bd495c	b.eq 0x00bd4988
00bd4960	ldr x8,[x19, #0x8]
00bd4964	cmp x8,x23
00bd4968	b.eq 0x00bd48d0
00bd496c	add x8,x8,#0x1
00bd4970	str x8,[x19, #0x8]
00bd4974	b 0x00bd48d0
00bd4978	ldr x8,[x0]
00bd497c	ldr x8,[x8, #0x50]
00bd4980	blr x8
00bd4984	b 0x00bd48f0
00bd4988	mov w8,wzr
00bd498c	b 0x00bd4994
00bd4990	mov w8,#0x2
00bd4994	ldp x9,x10,[x19]
00bd4998	ldur x9,[x9, #-0x18]
00bd499c	cmp x10,#0x0
00bd49a0	add x0,x19,x9
00bd49a4	orr w9,w8,#0x4
00bd49a8	ldr w10,[x0, #0x20]
00bd49ac	csel w8,w9,w8,eq
00bd49b0	orr w1,w10,w8
00bd49b4	bl 0x00c30130
00bd49b8	mov x0,x19
00bd49bc	ldp x20,x19,[sp, #0x30]
00bd49c0	ldr x23,[sp, #0x10]
00bd49c4	ldp x22,x21,[sp, #0x20]
00bd49c8	ldp x29,x30,[sp], #0x40
00bd49cc	autiasp
00bd49d0	ret
