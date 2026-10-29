/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x78690..0x78aac (1052 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_78690_1 {
    int field_0;
    unsigned int field_4;
} st_78690_1;

typedef struct st_78690_0 {
    char field_0;
} st_78690_0;

typedef struct st_78690_2 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_78690_2;

extern st_78690_2 g_cbef90;

unsigned long long sub_78690(long long a0, long long a1, char *a2, unsigned long long a3, unsigned short *a4, unsigned int a5)
{
    unsigned long long v8;  // 4106
    char *v9;  // x24
    st_78690_1 *v18;  // x9
    unsigned long v19;  // x9
    unsigned long long v20;  // x28
    unsigned long v21;  // x27
    st_78690_1 *v22;  // x10
    unsigned long v23;  // x10
    unsigned short v24;  // x27
    st_78690_1 *v25;  // x9
    unsigned long long v26;  // x12
    unsigned int v27;  // w10
    unsigned long long v10;  // w11
    unsigned int v28;  // w10
    unsigned short v29;  // x23
    unsigned long long v30;  // x8
    char *v31;  // x24
    st_78690_1 *v32;  // x9
    unsigned long long v33;  // x9
    unsigned int v34;  // w12
    unsigned long v35;  // x28
    unsigned int v36;  // w9
    st_78690_1 *v37;  // x8
    unsigned long v11;  // x20
    unsigned long long v38;  // x12
    unsigned long long v39;  // x8
    unsigned int v40;  // w9
    unsigned long long v41;  // x10
    st_78690_1 *v42;  // x8
    unsigned long long v43;  // x8
    unsigned int v44;  // w11
    unsigned int v45;  // w11
    unsigned long v46;  // x8
    st_78690_1 *v47;  // x9
    unsigned long long v12;  // x9
    unsigned long long v48;  // x9
    unsigned int v49;  // w11
    unsigned long v50;  // x12
    st_78690_1 *v51;  // x9
    unsigned long long v52;  // x9
    unsigned int v53;  // w11
    st_78690_1 *v54;  // x8
    unsigned long long v55;  // x14
    unsigned long long v56;  // w20
    unsigned long v57;  // x19
    unsigned long long v13;  // x25
    unsigned int v58;  // w9
    unsigned int v59;  // w9
    st_78690_1 *v14;  // x8
    unsigned long v15;  // x8
    unsigned long v16;  // x8
    char *v17;  // x24
    unsigned long long v0;  // [bp-0x9c]
    st_78690_0 **v1;  // [bp-0x98], Other Possible Types: char
    st_78690_0 *v2;  // [bp-0x90]
    char v3;  // [bp-0x88], Other Possible Types: unsigned long, unsigned long long
    unsigned int v4;  // [bp-0x80]
    unsigned long long *iter;  // [bp-0x70]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v2 = &v1;
    v1 = &v2;
    if (a3 < 3)
        return 0;
    v8 = arm64g_calculate_condition(130, sub_77f20(&v3, a0, a1), 120, 0);
    if (!(v8 & 1))
    {
        v9 = &a2[a3];
        v10 = *a4;
        v11 = a4 + 2;
        v12 = 1 << ((char)(v10 - 1) & 31);
        v0 = v10;
        if (!v0)
            v12 = 1;
        v13 = v11 + v12 * 4;
        v14 = v13 + *(v9 - 1) * 8;
        v15 = v14->field_4;
        v16 = *(short *)(v11 + (((unsigned int)v15 + 0x8000 & 0xffff0000) - v15 >> ((char)((unsigned int)v15 + 0x8000 >> 16) & 63)) * 2 + v14->field_0 * 2);
        if (!(a3 & 1))
        {
            v17 = v9 - 2;
            v18 = v13 + *(v9 - 2) * 8;
            v19 = v18->field_4;
            v20 = v16 & 0xffff;
            v21 = *(short *)(v11 + (((unsigned int)v19 + 0x8000 & 0xffff0000) - v19 >> ((char)((unsigned int)v19 + 0x8000 >> 16) & 63)) * 2 + v18->field_0 * 2);
            if (a3 >> 1 & 1)
                goto LABEL_78914;
        }
        else
        {
            v17 = v9 - 3;
            v22 = v13 + v17[1] * 8;
            v23 = v22->field_4;
            v24 = *(short *)(v11 + (((unsigned int)v23 + 0x8000 & 0xffff0000) - v23 >> ((char)((unsigned int)v23 + 0x8000 >> 16) & 63)) * 2 + v22->field_0 * 2);
            v25 = v13 + *(v9 - 3) * 8;
            v26 = v25->field_4 + v16 >> 16;
            v27 = v4;
            v3 |= ((&g_cbef90.field_0)[v26] & v16) << ((char)v27 & 63);
            v28 = v27 + (unsigned int)v26;
            v4 = v28;
            v29 = *(short *)(v11 + (v16 >> ((char)v26 & 63)) * 2 + v25->field_0 * 2);
            if (a5)
            {
                v30 = v28 >> 3;
                *iter = v3;
                iter = (char *)iter + v30;
                v4 = v28 & 7;
                v3 >>= ((char)v30 * 8 | (char)(v30 >> 61)) & 248 & 63;
                v20 = v24;
                v21 = v29;
                if (a3 >> 1 & 1)
                    goto LABEL_78914;
            }
            else
            {
                sub_783b4(&v3);
                v20 = v24;
                v21 = v29;
                if (a3 >> 1 & 1)
                    goto LABEL_78914;
            }
        }
        v31 = v17 - 2;
        v32 = v13 + v31[1] * 8;
        v33 = v32->field_4 + v20 >> 16;
        v34 = v4;
        v35 = *(short *)(v11 + (v20 >> ((char)v33 & 63)) * 2 + v32->field_0 * 2);
        v36 = v34 + (unsigned int)v33;
        v37 = v13 + *(v17 - 2) * 8;
        v38 = v37->field_4 + v21 >> 16;
        v39 = ((&g_cbef90.field_0)[v38] & v21) << ((char)v36 & 63) | ((&g_cbef90.field_0)[v33] & v20) << ((char)v34 & 63) | v3;
        v3 = v39;
        v40 = v36 + (unsigned int)v38;
        v4 = v40;
        v21 = *(short *)(v11 + (v21 >> ((char)v38 & 63)) * 2 + v37->field_0 * 2);
        if (a5)
            goto LABEL_788ec;
        while (1)
        {
            sub_783b4(&v3);
            v20 = v35;
            v17 = v31;
            while (1)
            {
LABEL_78914:
                if (v17 <= a2)
                {
                    v56 = v0;
                    v57 = (&g_cbef90.field_0)[v56];
                    v58 = v4;
                    v3 |= (v20 & v57) << ((char)v58 & 63);
                    v4 = v58 + v56;
                    sub_783b4(&v3);
                    v59 = v4;
                    v3 |= (v21 & v57) << ((char)v59 & 63);
                    v4 = v59 + v56;
                    sub_783b4(&v3);
                    return sub_78620(&v3);
                }
                v42 = v13 + *(v17 - 1) * 8;
                v43 = v20 + v42->field_4 >> 16;
                v44 = v4;
                v3 |= (v20 & (&g_cbef90.field_0)[v43]) << ((char)v44 & 63);
                v45 = v44 + (unsigned int)v43;
                v4 = v45;
                v46 = *(short *)(v11 + (v20 >> ((char)v43 & 63)) * 2 + v42->field_0 * 2);
                v47 = v13 + *(v17 - 2) * 8;
                v48 = v21 + v47->field_4 >> 16;
                v3 |= (v21 & (&g_cbef90.field_0)[v48]) << ((char)v45 & 63);
                v49 = v45 + (unsigned int)v48;
                v4 = v49;
                v50 = *(short *)(v11 + (v21 >> ((char)v48 & 63)) * 2 + v47->field_0 * 2);
                v51 = v13 + *(v17 - 3) * 8;
                v52 = v51->field_4 + v46 >> 16;
                v3 |= ((&g_cbef90.field_0)[v52] & v46) << ((char)v49 & 63);
                v53 = v49 + (unsigned int)v52;
                v4 = v53;
                v35 = *(short *)(v11 + (v46 >> ((char)v52 & 63)) * 2 + v51->field_0 * 2);
                v31 = v17 - 4;
                v54 = v13 + *(v17 - 4) * 8;
                v55 = v54->field_4 + v50 >> 16;
                v39 = ((&g_cbef90.field_0)[v55] & v50) << ((char)v53 & 63) | v3;
                v3 = v39;
                v40 = v53 + (unsigned int)v55;
                v4 = v40;
                v21 = *(short *)(v11 + (v50 >> ((char)v55 & 63)) * 2 + v54->field_0 * 2);
                if (!a5)
                    break;
LABEL_788ec:
                v41 = v40 >> 3;
                *iter = v39;
                iter = (char *)iter + v41;
                v4 = v40 & 7;
                v3 = v39 >> (((char)v41 * 8 | (char)(v41 >> 61)) & 248 & 63);
                v20 = v35;
                v17 = v31;
            }
        }
    }
    return 0;
}
