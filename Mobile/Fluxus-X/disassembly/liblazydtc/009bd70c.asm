; ssl_generate_session_id @ 009bd70c
009bd70c	str x23,[sp, #-0x40]!
009bd710	stp x22,x21,[sp, #0x10]
009bd714	stp x20,x19,[sp, #0x20]
009bd718	stp x29,x30,[sp, #0x30]
009bd71c	ldr w8,[x0]
009bd720	mov w9,#0xfefc
009bd724	mov x19,x0
009bd728	mov x20,x1
009bd72c	cmp w8,w9
009bd730	add x29,sp,#0x30
009bd734	b.gt 0x009bd818
009bd738	sub w9,w8,#0x300
009bd73c	cmp w9,#0x5
009bd740	b.cs 0x009bd834
009bd744	mov w8,#0x20
009bd748	str x8,[x20, #0x250]
009bd74c	ldr w8,[x19, #0xa98]
009bd750	cbz w8,0x009bd760
009bd754	str xzr,[x20, #0x250]
009bd758	mov w0,#0x1
009bd75c	b 0x009bd904
009bd760	ldr x0,[x19, #0x1d68]
009bd764	bl 0x00c35680
009bd768	cbz w0,0x009bd904
009bd76c	ldr x8,[x19, #0xb88]
009bd770	ldr x0,[x8, #0x3c8]
009bd774	bl 0x00c35680
009bd778	cbz w0,0x009bd864
009bd77c	ldr x23,[x19, #0x938]
009bd780	ldr x8,[x19, #0xb88]
009bd784	cbnz x23,0x009bd79c
009bd788	ldr x9,[x8, #0x1b0]
009bd78c	adrp x10,0x9bd000
009bd790	add x10,x10,#0x920
009bd794	cmp x9,#0x0
009bd798	csel x23,x10,x9,eq
009bd79c	ldr x0,[x8, #0x3c8]
009bd7a0	bl 0x00c35690
009bd7a4	ldr x0,[x19, #0x1d68]
009bd7a8	bl 0x00c35690
009bd7ac	ldr x22,[x20, #0x250]
009bd7b0	add x21,x20,#0x258
009bd7b4	mov x0,x21
009bd7b8	mov w1,wzr
009bd7bc	mov x2,x22
009bd7c0	bl 0x00c301c0
009bd7c4	add x2,sp,#0xc
009bd7c8	mov x0,x19
009bd7cc	mov x1,x21
009bd7d0	str w22,[sp, #0xc]
009bd7d4	blr x23
009bd7d8	cbz w0,0x009bd894
009bd7dc	ldr w2,[sp, #0xc]
009bd7e0	cbz w2,0x009bd7f0
009bd7e4	ldr x8,[x20, #0x250]
009bd7e8	cmp x8,x2
009bd7ec	b.cs 0x009bd8bc
009bd7f0	bl 0x00c342a0
009bd7f4	adrp x0,0x2db000
009bd7f8	adrp x2,0x29d000
009bd7fc	add x0,x0,#0xb17
009bd800	add x2,x2,#0xd99
009bd804	mov w1,#0x1ae
009bd808	bl 0x00c342b0
009bd80c	mov w1,#0x50
009bd810	mov w2,#0x12f
009bd814	b 0x009bd8f4
009bd818	mov w9,#0xfeff
009bd81c	cmp w8,w9
009bd820	b.eq 0x009bd744
009bd824	mov w9,#0xfefd
009bd828	cmp w8,w9
009bd82c	b.eq 0x009bd744
009bd830	b 0x009bd83c
009bd834	cmp w8,#0x100
009bd838	b.eq 0x009bd744
009bd83c	bl 0x00c342a0
009bd840	adrp x0,0x2db000
009bd844	adrp x2,0x29d000
009bd848	add x0,x0,#0xb17
009bd84c	add x2,x2,#0xd99
009bd850	mov w1,#0x177
009bd854	bl 0x00c342b0
009bd858	mov w1,#0x50
009bd85c	mov w2,#0x103
009bd860	b 0x009bd8f4
009bd864	ldr x0,[x19, #0x1d68]
009bd868	bl 0x00c35690
009bd86c	bl 0x00c342a0
009bd870	adrp x0,0x2db000
009bd874	adrp x2,0x29d000
009bd878	add x0,x0,#0xb17
009bd87c	add x2,x2,#0xd99
009bd880	mov w1,#0x195
009bd884	bl 0x00c342b0
009bd888	mov w1,#0x50
009bd88c	mov w2,#0x115
009bd890	b 0x009bd8f4
009bd894	bl 0x00c342a0
009bd898	adrp x0,0x2db000
009bd89c	adrp x2,0x29d000
009bd8a0	add x0,x0,#0xb17
009bd8a4	add x2,x2,#0xd99
009bd8a8	mov w1,#0x1a4
009bd8ac	bl 0x00c342b0
009bd8b0	mov w1,#0x50
009bd8b4	mov w2,#0x12d
009bd8b8	b 0x009bd8f4
009bd8bc	mov x0,x19
009bd8c0	mov x1,x21
009bd8c4	str x2,[x20, #0x250]
009bd8c8	bl 0x00c35a50
009bd8cc	cbz w0,0x009bd918
009bd8d0	bl 0x00c342a0
009bd8d4	adrp x0,0x2db000
009bd8d8	adrp x2,0x29d000
009bd8dc	add x0,x0,#0xb17
009bd8e0	add x2,x2,#0xd99
009bd8e4	mov w1,#0x1b5
009bd8e8	bl 0x00c342b0
009bd8ec	mov w1,#0x50
009bd8f0	mov w2,#0x12e
009bd8f4	mov x0,x19
009bd8f8	mov x3,xzr
009bd8fc	bl 0x00c34410
009bd900	mov w0,wzr
009bd904	ldp x29,x30,[sp, #0x30]
009bd908	ldp x20,x19,[sp, #0x20]
009bd90c	ldp x22,x21,[sp, #0x10]
009bd910	ldr x23,[sp], #0x40
009bd914	ret
009bd918	mov w0,#0x1
009bd91c	b 0x009bd904
