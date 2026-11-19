; FUN_00ba8898 @ 00ba8898
00ba8898	sub sp,sp,#0x80
00ba889c	str x25,[sp, #0x30]
00ba88a0	stp x24,x23,[sp, #0x40]
00ba88a4	stp x22,x21,[sp, #0x50]
00ba88a8	stp x20,x19,[sp, #0x60]
00ba88ac	stp x29,x30,[sp, #0x70]
00ba88b0	add x29,sp,#0x70
00ba88b4	mrs x25,tpidr_el0
00ba88b8	ldr x8,[x25, #0x28]
00ba88bc	mov x23,x0
00ba88c0	mov w0,w5
00ba88c4	mov x19,x4
00ba88c8	mov x20,x3
00ba88cc	mov x21,x2
00ba88d0	mov x22,x1
00ba88d4	str x8,[sp, #0x28]
00ba88d8	str xzr,[sp, #0x20]
00ba88dc	bl 0x00c30210
00ba88e0	mov x24,x0
00ba88e4	cbz x0,0x00ba897c
00ba88e8	add x0,sp,#0x8
00ba88ec	bl 0x00c42840
00ba88f0	add x0,sp,#0x8
00ba88f4	mov x1,x24
00ba88f8	mov w2,wzr
00ba88fc	bl 0x00c42850
00ba8900	mov w24,w0
00ba8904	cbnz w0,0x00ba8970
00ba8908	add x0,sp,#0x8
00ba890c	bl 0x00c42860
00ba8910	mov w24,w0
00ba8914	cbnz w0,0x00ba8970
00ba8918	add x0,sp,#0x8
00ba891c	add x1,sp,#0x20
00ba8920	mov w2,#0x8
00ba8924	bl 0x00c42870
00ba8928	mov w24,w0
00ba892c	cbnz w0,0x00ba8970
00ba8930	add x0,sp,#0x8
00ba8934	mov x1,x23
00ba8938	mov x2,x22
00ba893c	bl 0x00c42870
00ba8940	mov w24,w0
00ba8944	cbnz w0,0x00ba8970
00ba8948	add x0,sp,#0x8
00ba894c	mov x1,x21
00ba8950	mov x2,x20
00ba8954	bl 0x00c42870
00ba8958	mov w24,w0
00ba895c	cbnz w0,0x00ba8970
00ba8960	add x0,sp,#0x8
00ba8964	mov x1,x19
00ba8968	bl 0x00c42820
00ba896c	mov w24,w0
00ba8970	add x0,sp,#0x8
00ba8974	bl 0x00c42830
00ba8978	b 0x00ba8980
00ba897c	mov w24,#0xffffbf80
00ba8980	ldr x8,[x25, #0x28]
00ba8984	ldr x9,[sp, #0x28]
00ba8988	cmp x8,x9
00ba898c	b.ne 0x00ba89b0
00ba8990	mov w0,w24
00ba8994	ldp x29,x30,[sp, #0x70]
00ba8998	ldp x20,x19,[sp, #0x60]
00ba899c	ldp x22,x21,[sp, #0x50]
00ba89a0	ldp x24,x23,[sp, #0x40]
00ba89a4	ldr x25,[sp, #0x30]
00ba89a8	add sp,sp,#0x80
00ba89ac	ret
00ba89b0	bl 0x00c2fec0
