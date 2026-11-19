; BIO_sock_info @ 009ff748
009ff748	sub sp,sp,#0x30
009ff74c	stp x20,x19,[sp, #0x10]
009ff750	stp x29,x30,[sp, #0x20]
009ff754	add x29,sp,#0x20
009ff758	cbz w1,0x009ff79c
009ff75c	bl 0x00c342a0
009ff760	adrp x0,0x2c3000
009ff764	adrp x2,0x2b7000
009ff768	add x0,x0,#0x72e
009ff76c	add x2,x2,#0x902
009ff770	mov w1,#0x17e
009ff774	bl 0x00c342b0
009ff778	mov w0,#0x20
009ff77c	mov w1,#0x8c
009ff780	mov x2,xzr
009ff784	bl 0x00c342c0
009ff788	mov w0,wzr
009ff78c	ldp x29,x30,[sp, #0x20]
009ff790	ldp x20,x19,[sp, #0x10]
009ff794	add sp,sp,#0x30
009ff798	ret
009ff79c	orr w8,wzr,#0x70
009ff7a0	str w8,[sp, #0xc]
009ff7a4	mov w19,w0
009ff7a8	ldr x0,[x2]
009ff7ac	bl 0x00c38570
009ff7b0	mov x1,x0
009ff7b4	add x2,sp,#0xc
009ff7b8	mov w0,w19
009ff7bc	bl 0x00c31c20
009ff7c0	cmn w0,#0x1
009ff7c4	b.eq 0x009ff7fc
009ff7c8	ldr w8,[sp, #0xc]
009ff7cc	cmp w8,#0x71
009ff7d0	b.cc 0x009ff858
009ff7d4	bl 0x00c342a0
009ff7d8	adrp x0,0x2c3000
009ff7dc	adrp x2,0x2b7000
009ff7e0	add x0,x0,#0x72e
009ff7e4	add x2,x2,#0x902
009ff7e8	mov w1,#0x178
009ff7ec	bl 0x00c342b0
009ff7f0	mov w0,#0x20
009ff7f4	mov w1,#0x85
009ff7f8	b 0x009ff780
009ff7fc	bl 0x00c342a0
009ff800	adrp x19,0x2c3000
009ff804	adrp x20,0x2b7000
009ff808	add x19,x19,#0x72e
009ff80c	add x20,x20,#0x902
009ff810	mov w1,#0x172
009ff814	mov x0,x19
009ff818	mov x2,x20
009ff81c	bl 0x00c342b0
009ff820	bl 0x00c30710
009ff824	ldr w1,[x0]
009ff828	adrp x2,0x2b9000
009ff82c	add x2,x2,#0xb6f
009ff830	mov w0,#0x2
009ff834	bl 0x00c342c0
009ff838	bl 0x00c342a0
009ff83c	mov w1,#0x174
009ff840	mov x0,x19
009ff844	mov x2,x20
009ff848	bl 0x00c342b0
009ff84c	mov w0,#0x20
009ff850	mov w1,#0x84
009ff854	b 0x009ff780
009ff858	mov w0,#0x1
009ff85c	b 0x009ff78c
