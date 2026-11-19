; ssl3_generate_master_secret @ 009ab754
009ab754	sub sp,sp,#0xb0
009ab758	stp x28,x27,[sp, #0x50]
009ab75c	stp x26,x25,[sp, #0x60]
009ab760	stp x24,x23,[sp, #0x70]
009ab764	stp x22,x21,[sp, #0x80]
009ab768	stp x20,x19,[sp, #0x90]
009ab76c	stp x29,x30,[sp, #0xa0]
009ab770	add x29,sp,#0xa0
009ab774	mov x21,x4
009ab778	mov x22,x3
009ab77c	mov x23,x2
009ab780	mov x24,x1
009ab784	mov x19,x0
009ab788	bl 0x00c31fa0
009ab78c	cbz x0,0x009ab940
009ab790	mov x20,x0
009ab794	str x21,[sp]
009ab798	mov x21,xzr
009ab79c	mov x28,xzr
009ab7a0	add x25,x19,#0x160
009ab7a4	add x26,x19,#0x140
009ab7a8	ldr x8,[x19, #0x9a8]
009ab7ac	mov x0,x20
009ab7b0	mov x2,xzr
009ab7b4	ldr x1,[x8, #0x108]
009ab7b8	bl 0x00c31f70
009ab7bc	cmp w0,#0x1
009ab7c0	b.lt 0x009ab8f0
009ab7c4	adrp x8,0xc53000
009ab7c8	add x8,x8,#0xc68
009ab7cc	ldr x27,[x8, x21, LSL #0x3]
009ab7d0	mov x0,x27
009ab7d4	bl 0x00c2ff50
009ab7d8	mov x2,x0
009ab7dc	mov x0,x20
009ab7e0	mov x1,x27
009ab7e4	bl 0x00c31f80
009ab7e8	cmp w0,#0x1
009ab7ec	b.lt 0x009ab8f0
009ab7f0	mov x0,x20
009ab7f4	mov x1,x23
009ab7f8	mov x2,x22
009ab7fc	bl 0x00c31f80
009ab800	cmp w0,#0x1
009ab804	b.lt 0x009ab8f0
009ab808	mov w2,#0x20
009ab80c	mov x0,x20
009ab810	mov x1,x25
009ab814	bl 0x00c31f80
009ab818	cmp w0,#0x1
009ab81c	b.lt 0x009ab8f0
009ab820	mov w2,#0x20
009ab824	mov x0,x20
009ab828	mov x1,x26
009ab82c	bl 0x00c31f80
009ab830	cmp w0,#0x1
009ab834	b.lt 0x009ab8f0
009ab838	add x1,sp,#0x10
009ab83c	add x2,sp,#0xc
009ab840	mov x0,x20
009ab844	bl 0x00c31f60
009ab848	cmp w0,#0x1
009ab84c	b.lt 0x009ab8f0
009ab850	ldr x8,[x19, #0x9a8]
009ab854	mov x0,x20
009ab858	mov x2,xzr
009ab85c	ldr x1,[x8, #0x100]
009ab860	bl 0x00c31f70
009ab864	cmp w0,#0x1
009ab868	b.lt 0x009ab8f0
009ab86c	mov x0,x20
009ab870	mov x1,x23
009ab874	mov x2,x22
009ab878	bl 0x00c31f80
009ab87c	cmp w0,#0x1
009ab880	b.lt 0x009ab8f0
009ab884	ldr w2,[sp, #0xc]
009ab888	add x1,sp,#0x10
009ab88c	mov x0,x20
009ab890	bl 0x00c31f80
009ab894	cmp w0,#0x1
009ab898	b.lt 0x009ab8f0
009ab89c	add x2,sp,#0xc
009ab8a0	mov x0,x20
009ab8a4	mov x1,x24
009ab8a8	bl 0x00c31f60
009ab8ac	cmp w0,#0x0
009ab8b0	b.le 0x009ab8f0
009ab8b4	ldr w8,[sp, #0xc]
009ab8b8	add x21,x21,#0x1
009ab8bc	cmp x21,#0x3
009ab8c0	add x24,x24,x8
009ab8c4	add x28,x28,x8
009ab8c8	b.cc 0x009ab7a8
009ab8cc	mov x0,x20
009ab8d0	bl 0x00c31f90
009ab8d4	add x0,sp,#0x10
009ab8d8	mov w1,#0x40
009ab8dc	bl 0x00c34750
009ab8e0	ldr x8,[sp]
009ab8e4	mov w0,#0x1
009ab8e8	str x28,[x8]
009ab8ec	b 0x009ab978
009ab8f0	bl 0x00c342a0
009ab8f4	adrp x0,0x2a3000
009ab8f8	adrp x2,0x2db000
009ab8fc	add x0,x0,#0xb34
009ab900	add x2,x2,#0x971
009ab904	orr w1,wzr,#0x1ff
009ab908	bl 0x00c342b0
009ab90c	mov w8,#0x100
009ab910	movk w8,#0xc, LSL #16
009ab914	add w2,w8,#0x3
009ab918	mov w1,#0x50
009ab91c	mov x0,x19
009ab920	mov x3,xzr
009ab924	bl 0x00c34410
009ab928	mov x0,x20
009ab92c	bl 0x00c31f90
009ab930	add x0,sp,#0x10
009ab934	mov w1,#0x40
009ab938	bl 0x00c34750
009ab93c	b 0x009ab974
009ab940	bl 0x00c342a0
009ab944	adrp x0,0x2a3000
009ab948	adrp x2,0x2db000
009ab94c	add x0,x0,#0xb34
009ab950	add x2,x2,#0x971
009ab954	mov w1,#0x1ee
009ab958	bl 0x00c342b0
009ab95c	mov w2,#0x100
009ab960	mov w1,#0x50
009ab964	movk w2,#0xc, LSL #16
009ab968	mov x0,x19
009ab96c	mov x3,xzr
009ab970	bl 0x00c34410
009ab974	mov w0,wzr
009ab978	ldp x29,x30,[sp, #0xa0]
009ab97c	ldp x20,x19,[sp, #0x90]
009ab980	ldp x22,x21,[sp, #0x80]
009ab984	ldp x24,x23,[sp, #0x70]
009ab988	ldp x26,x25,[sp, #0x60]
009ab98c	ldp x28,x27,[sp, #0x50]
009ab990	add sp,sp,#0xb0
009ab994	ret
