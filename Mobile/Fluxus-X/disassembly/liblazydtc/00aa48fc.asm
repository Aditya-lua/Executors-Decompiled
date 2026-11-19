; FUN_00aa48fc @ 00aa48fc
00aa48fc	stp x20,x19,[sp, #-0x20]!
00aa4900	adrp x1,0x2aa000
00aa4904	mov x20,x0
00aa4908	add x1,x1,#0x4b5
00aa490c	mov w0,#0x10
00aa4910	mov w2,#0x102
00aa4914	stp x29,x30,[sp, #0x10]
00aa4918	add x29,sp,#0x10
00aa491c	bl 0x00c34250
00aa4920	mov x19,x0
00aa4924	cbz x0,0x00aa4994
00aa4928	ldr x0,[x20]
00aa492c	cbz x0,0x00aa4948
00aa4930	adrp x1,0x2aa000
00aa4934	add x1,x1,#0x4b5
00aa4938	mov w2,#0x107
00aa493c	bl 0x00c34600
00aa4940	str x0,[x19]
00aa4944	cbz x0,0x00aa496c
00aa4948	ldr x0,[x20, #0x8]
00aa494c	cbz x0,0x00aa4994
00aa4950	adrp x1,0x2aa000
00aa4954	add x1,x1,#0x4b5
00aa4958	mov w2,#0x10c
00aa495c	bl 0x00c34600
00aa4960	str x0,[x19, #0x8]
00aa4964	cbnz x0,0x00aa4994
00aa4968	ldr x0,[x19]
00aa496c	adrp x20,0x2aa000
00aa4970	add x20,x20,#0x4b5
00aa4974	mov w2,#0x112
00aa4978	mov x1,x20
00aa497c	bl 0x00c32310
00aa4980	mov w2,#0x113
00aa4984	mov x0,x19
00aa4988	mov x1,x20
00aa498c	bl 0x00c32310
00aa4990	mov x19,xzr
00aa4994	ldp x29,x30,[sp, #0x10]
00aa4998	mov x0,x19
00aa499c	ldp x20,x19,[sp], #0x20
00aa49a0	ret
