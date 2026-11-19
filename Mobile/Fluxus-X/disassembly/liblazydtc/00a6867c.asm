; FUN_00a6867c @ 00a6867c
00a6867c	sub sp,sp,#0xd0
00a68680	str x23,[sp, #0x90]
00a68684	stp x22,x21,[sp, #0xa0]
00a68688	stp x20,x19,[sp, #0xb0]
00a6868c	stp x29,x30,[sp, #0xc0]
00a68690	add x29,sp,#0xc0
00a68694	str w1,[sp, #0x4]
00a68698	cbz x0,0x00a68738
00a6869c	ldr x8,[x0]
00a686a0	mov x22,x0
00a686a4	cbz x8,0x00a68738
00a686a8	ldr x8,[x8, #0x58]
00a686ac	cbz x8,0x00a68780
00a686b0	sub x23,x29,#0x38
00a686b4	str xzr,[x23]
00a686b8	ldr x8,[x22, #0x8]
00a686bc	mov x20,x4
00a686c0	mov x19,x3
00a686c4	mov x21,x2
00a686c8	cbz x8,0x00a687bc
00a686cc	add x0,sp,#0x30
00a686d0	mov w2,#0x50
00a686d4	mov w1,wzr
00a686d8	bl 0x00c301c0
00a686dc	adrp x0,0x2d7000
00a686e0	add x0,x0,#0xe7d
00a686e4	add x8,sp,#0x8
00a686e8	sub x1,x29,#0x38
00a686ec	bl 0x00c36270
00a686f0	ldr x8,[sp, #0x28]
00a686f4	ldur q0,[sp, #0x18]
00a686f8	ldur q1,[sp, #0x8]
00a686fc	str x8,[sp, #0x50]
00a68700	stp q1,q0,[sp, #0x30]
00a68704	ldr x9,[x22]
00a68708	ldr x8,[x9, #0x80]
00a6870c	cbz x8,0x00a687a8
00a68710	ldr x0,[x22, #0x8]
00a68714	add x1,sp,#0x30
00a68718	blr x8
00a6871c	cbz w0,0x00a687bc
00a68720	ldr x8,[x23]
00a68724	cbnz x21,0x00a687c4
00a68728	cbz x19,0x00a6888c
00a6872c	str x8,[x19]
00a68730	mov w0,#0x1
00a68734	b 0x00a68768
00a68738	bl 0x00c342a0
00a6873c	adrp x0,0x2a6000
00a68740	adrp x2,0x2c1000
00a68744	add x0,x0,#0x18
00a68748	add x2,x2,#0xcd6
00a6874c	mov w1,#0x8a
00a68750	bl 0x00c342b0
00a68754	orr w0,wzr,#0x6
00a68758	mov w1,#0xda
00a6875c	mov x2,xzr
00a68760	bl 0x00c342c0
00a68764	mov w0,wzr
00a68768	ldp x29,x30,[sp, #0xc0]
00a6876c	ldp x20,x19,[sp, #0xb0]
00a68770	ldp x22,x21,[sp, #0xa0]
00a68774	ldr x23,[sp, #0x90]
00a68778	add sp,sp,#0xd0
00a6877c	ret
00a68780	bl 0x00c342a0
00a68784	adrp x0,0x2a6000
00a68788	adrp x2,0x2c1000
00a6878c	add x0,x0,#0x18
00a68790	add x2,x2,#0xcd6
00a68794	mov w1,#0x8e
00a68798	bl 0x00c342b0
00a6879c	orr w0,wzr,#0x6
00a687a0	mov w1,#0xbc
00a687a4	b 0x00a6875c
00a687a8	ldr x8,[x9, #0x78]
00a687ac	cbz x8,0x00a687bc
00a687b0	add x0,sp,#0x30
00a687b4	blr x8
00a687b8	cbnz w0,0x00a68720
00a687bc	mov x8,xzr
00a687c0	cbz x21,0x00a68728
00a687c4	cmp x8,x20
00a687c8	b.ls 0x00a687f4
00a687cc	bl 0x00c342a0
00a687d0	adrp x0,0x2a6000
00a687d4	adrp x2,0x2c1000
00a687d8	add x0,x0,#0x18
00a687dc	add x2,x2,#0xcd6
00a687e0	mov w1,#0x9c
00a687e4	bl 0x00c342b0
00a687e8	orr w0,wzr,#0x6
00a687ec	mov w1,#0x9b
00a687f0	b 0x00a6875c
00a687f4	ldr w8,[sp, #0x4]
00a687f8	cbz w8,0x00a68864
00a687fc	adrp x0,0x2db000
00a68800	add x0,x0,#0xfe7
00a68804	add x8,sp,#0x8
00a68808	add x1,sp,#0x4
00a6880c	bl 0x00c36260
00a68810	ldr x8,[sp, #0x28]
00a68814	ldur q0,[sp, #0x18]
00a68818	ldur q1,[sp, #0x8]
00a6881c	str x8,[sp, #0x50]
00a68820	add x8,sp,#0x8
00a68824	stp q1,q0,[sp, #0x30]
00a68828	bl 0x00c34c40
00a6882c	ldr x8,[sp, #0x28]
00a68830	ldur q0,[sp, #0x18]
00a68834	ldur q1,[sp, #0x8]
00a68838	str x8,[sp, #0x78]
00a6883c	stur q0,[sp, #0x68]
00a68840	stur q1,[sp, #0x58]
00a68844	ldr x8,[x22]
00a68848	ldr x8,[x8, #0x88]
00a6884c	cbz x8,0x00a68864
00a68850	ldr x0,[x22, #0x8]
00a68854	add x1,sp,#0x30
00a68858	blr x8
00a6885c	cmp w0,#0x0
00a68860	b.le 0x00a688b8
00a68864	ldp x8,x0,[x22]
00a68868	add x2,sp,#0x8
00a6886c	mov x1,x21
00a68870	mov x3,x20
00a68874	ldr x8,[x8, #0x58]
00a68878	blr x8
00a6887c	cbz x19,0x00a68768
00a68880	ldr x8,[sp, #0x8]
00a68884	str x8,[x19]
00a68888	b 0x00a68768
00a6888c	bl 0x00c342a0
00a68890	adrp x0,0x2a6000
00a68894	adrp x2,0x2c1000
00a68898	add x0,x0,#0x18
00a6889c	add x2,x2,#0xcd6
00a688a0	mov w1,#0x95
00a688a4	bl 0x00c342b0
00a688a8	mov w1,#0x102
00a688ac	orr w0,wzr,#0x6
00a688b0	movk w1,#0xc, LSL #16
00a688b4	b 0x00a6875c
00a688b8	bl 0x00c342a0
00a688bc	adrp x0,0x2a6000
00a688c0	adrp x2,0x2c1000
00a688c4	add x0,x0,#0x18
00a688c8	add x2,x2,#0xcd6
00a688cc	mov w1,#0xa4
00a688d0	bl 0x00c342b0
00a688d4	orr w0,wzr,#0x6
00a688d8	mov w1,#0xe3
00a688dc	b 0x00a6875c
