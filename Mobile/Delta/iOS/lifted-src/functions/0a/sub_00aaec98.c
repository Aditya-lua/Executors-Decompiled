/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaaec98..0xaaefc4 (812 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aaec98_1 {
    char padding_0[136];
    long long field_88;
} st_aaec98_1;

typedef struct st_aaec98_0 {
    char padding_0[8];
    long long field_8;
    unsigned int field_10;
    char padding_14[84];
    uint128_t field_68;
    unsigned int field_78;
    char padding_7c[4];
    long long field_80;
    long long field_88;
    char field_90;
    char padding_91[19];
    unsigned int field_a4;
} st_aaec98_0;


unsigned int sub_aaec98(st_aaec98_0 *a0, unsigned long long a1)
{
    unsigned long long v11;  // x26
    unsigned long long v12;  // x25
    unsigned int index;  // x0
    unsigned long long v22;  // x9
    unsigned int idx;  // x20
    unsigned int v24;  // x8
    st_aaec98_1 *v25;  // x0
    unsigned int v26;  // x8
    uint128_t v27;  // q0
    unsigned int v28;  // x8
    unsigned int v29;  // x8
    unsigned int v30;  // x8
    unsigned long long v13;  // x24
    unsigned int v31;  // x8
    unsigned int v32;  // x8
    unsigned int v33;  // x8
    uint128_t v34;  // q0
    unsigned long long v35;  // x21
    unsigned int v36;  // x8
    unsigned int v37;  // x22
    unsigned int idx1;  // x24
    unsigned long v39;  // x25
    unsigned int v40;  // x8
    unsigned long long v14;  // x23
    unsigned int v41;  // x8
    unsigned int v42;  // x8
    unsigned long v43;  // x9
    unsigned int v44;  // x8
    unsigned long long v15;  // x22
    unsigned long long v16;  // x21
    unsigned long long v17;  // x20
    unsigned long long v18;  // x19
    unsigned long long v19;  // x30
    long long v20;  // x0
    unsigned long long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    if (*(long long *)&a0->padding_14[12])
        return 0;
    v0 = v11;
    v1 = v12;
    v2 = v13;
    v3 = v14;
    v4 = v15;
    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = &v10;
    v9 = v19;
    v20 = sub_9ffdd0();
    if (v20 != sub_ab3878(v20))
        return 0;
    index = sub_ab1354(a0->field_8);
    if (!index)
        return index;
    v22 = a1;
    idx = index;
    if (!((unsigned int)a1 & 3))
    {
LABEL_aaed40:
        if (!(v22 & 1))
        {
            *(unsigned int *)(index + 16) = a0->field_10;
            *(int *)(index + 164) = *(int *)&a0->padding_91[11];
            v27 = *(int128_t *)&(a0->padding_14)[1];
            *(int *)(index + 120) = *(int *)((char *)&a0->field_68 + 8);
            *(uint128_t *)(index + 104) = v27;
            goto LABEL_aaed64;
        }
        if (!*(long long *)&a0->padding_14[36] || (v28 = sub_9e4b00(*(long long *)&a0->padding_14[36]), index = idx, *(unsigned long long *)(idx + 56) = v28, v25 = (st_aaec98_1 *)index, v28))
        {
            if (!*(long long *)&a0->padding_14[44] || (v29 = sub_9e4b00(*(long long *)&a0->padding_14[44]), index = idx, *(unsigned long long *)(idx + 64) = v29, v25 = (st_aaec98_1 *)index, v29))
            {
                if (!*(long long *)&a0->padding_14[52] || (v30 = sub_9e4b00(*(long long *)&a0->padding_14[52]), index = idx, *(unsigned long long *)(idx + 72) = v30, v25 = (st_aaec98_1 *)index, v30))
                {
                    if (!*(long long *)&a0->padding_14[60] || (v31 = sub_9e4b00(*(long long *)&a0->padding_14[60]), index = idx, *(unsigned long long *)(idx + 80) = v31, v25 = (st_aaec98_1 *)index, v31))
                    {
                        if (!*(long long *)&a0->padding_14[0x44] || (v32 = sub_9e4b00(*(long long *)&a0->padding_14[0x44]), index = idx, *(unsigned long long *)(idx + 88) = v32, v25 = (st_aaec98_1 *)index, v32))
                        {
                            if (!*(long long *)&a0->padding_14[76] || !(v33 = sub_9e4b00(*(long long *)&a0->padding_14[76]), index = idx, *(unsigned long long *)(idx + 96) = v33, v25 = (st_aaec98_1 *)index, !v33))
                            {
                                *(unsigned int *)(index + 16) = a0->field_10;
                                *(int *)(index + 164) = *(int *)&a0->padding_91[11];
                                v34 = *(int128_t *)&(a0->padding_14)[1];
                                *(int *)(index + 120) = *(int *)((char *)&a0->field_68 + 8);
                                *(uint128_t *)(index + 104) = v34;
                                v35 = sub_ad69e4(a0->field_80);
                                index = idx;
                                if ((int)v35 < 1)
                                {
LABEL_aaed64:
                                    if (!*(long long *)&a0->field_78 || (v43 = sub_aadf34(*(long long *)&a0->field_78), *(unsigned long *)(idx + 128) = v43, index = idx, !*(long long *)(*(long long *)&a0->field_78 + 8) || (index = idx, *(long long *)(v43 + 8) || (v44 = sub_9cf9b4(*(long long *)(*(long long *)&a0->field_78 + 8)), index = idx, *(unsigned long long *)(*(long long *)(idx + 128) + 32) = v44, v25 = (st_aaec98_1 *)index, v44))))
                                    {
                                        v25 = (st_aaec98_1 *)idx;
                                        if (sub_a6a674(9, index + 144, &a0->field_88))
                                            return idx;
                                    }
                                }
                                else
                                {
                                    v36 = sub_ad61e0(0, v35);
                                    v25 = (st_aaec98_1 *)idx;
                                    *(unsigned long long *)(idx + 0x88) = v36;
                                    if (v36)
                                    {
                                        v37 = 0;
                                        while (1)
                                        {
                                            idx1 = sub_a6bffc(40, "crypto/rsa/rsa_backend.c", 524);
                                            v25 = (st_aaec98_1 *)idx;
                                            if (!idx1)
                                                break;
                                            sub_ad68a0(v25->field_88, idx1);
                                            v39 = sub_ad69f8(a0->field_80, v37);
                                            if (*(long long *)v39 && !(v40 = sub_9e4b00(*(long long *)v39), v25 = (st_aaec98_1 *)idx, *(unsigned long long *)idx1 = v40, v40) || *(long long *)(v39 + 8) && !(v41 = sub_9e4b00(*(long long *)(v39 + 8)), v25 = (st_aaec98_1 *)idx, *(unsigned long long *)(idx1 + 8) = v41, v41) || *(long long *)(v39 + 16) && !(v42 = sub_9e4b00(*(long long *)(v39 + 16)), v25 = (st_aaec98_1 *)idx, *(unsigned long long *)(idx1 + 16) = v42, v42))
                                                break;
                                            v37 += 1;
                                            if ((unsigned int)v35 == v37)
                                            {
                                                index = idx;
                                                v25 = (st_aaec98_1 *)index;
                                                if (sub_ab2948(idx))
                                                    goto LABEL_aaed64;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    else if (*(long long *)&a0->padding_14[20])
    {
        v22 = a1;
        v24 = sub_9e4b00(*(long long *)&a0->padding_14[20]);
        index = idx;
        *(unsigned long long *)(idx + 40) = v24;
        v25 = (st_aaec98_1 *)index;
        if (v24)
            goto LABEL_aaed1c;
    }
    else
    {
LABEL_aaed1c:
        if (!*(long long *)&a0->padding_14[28])
            goto LABEL_aaed40;
        v22 = a1;
        v26 = sub_9e4b00(*(long long *)&a0->padding_14[28]);
        index = idx;
        *(unsigned long long *)(idx + 48) = v26;
        v25 = (st_aaec98_1 *)index;
        if (v26)
            goto LABEL_aaed40;
    }
    sub_ab1360(v25);
    return 0;
}
