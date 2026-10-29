/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x50f114..0x50f5f8 (1252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_50f114_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_50f114_0;

extern char g_d1f230;
extern unsigned long long g_d20cb8[4];
extern st_50f114_0 g_d21a98;
extern char g_10002b0;

void sub_50f114(unsigned long a0)
{
    unsigned int v10;  // w9
    unsigned int v11;  // w10
    unsigned int v20;  // w1
    unsigned int v21;  // w2
    unsigned int v22;  // w6
    unsigned int v23;  // w1
    unsigned int v24;  // w1
    unsigned long long v26;  // x4
    unsigned long long i;  // x1
    char *v28;  // x2
    char *v29;  // x3
    unsigned int v12;  // w11
    char *v30;  // x5
    unsigned long long v31;  // x6
    unsigned long long v32;  // x3
    unsigned long long v33;  // x7
    unsigned long long v34;  // x5
    unsigned long long v35;  // x6
    unsigned long long v36;  // x3
    unsigned long long v37;  // x3
    unsigned int v38;  // w5
    unsigned int v39;  // w6
    unsigned int v13;  // w12
    unsigned int v40;  // w7
    unsigned int v41;  // w6
    char v42;  // x6
    char *v43;  // x5
    unsigned long long v44;  // x6
    unsigned long long v45;  // x5
    unsigned long long v46;  // x5
    unsigned long long v47;  // x5
    unsigned int v48;  // w3
    unsigned int v49;  // w4
    unsigned int v14;  // w13
    unsigned int v50;  // w5
    unsigned int v51;  // w7
    unsigned int v52;  // w5
    unsigned int v53;  // w3
    unsigned int v54;  // w4
    unsigned int v55;  // w7
    unsigned int v56;  // w3
    unsigned int v57;  // w1
    unsigned int v58;  // w2
    unsigned int v59;  // w2
    unsigned int v15;  // w12
    unsigned int v60;  // w1
    unsigned int v61;  // w2
    unsigned int v62;  // w1
    unsigned int v16;  // w9
    unsigned int v17;  // w10
    unsigned int v18;  // w9
    unsigned int v19;  // w11
    char *v0;  // [bp-0x68], Other Possible Types: char
    char *v1;  // [bp-0x60]
    unsigned long long j;  // [bp-0x58]
    unsigned int v3;  // [bp-0x50], Other Possible Types: unsigned long long
    unsigned long long v4;  // [bp-0x48]
    unsigned long long v5;  // [bp-0x40]
    unsigned long long v6;  // [bp-0x3b]
    unsigned long v7;  // [bp-0x28]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v7 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v10 = (unsigned int)v1;
    v11 = (unsigned int)v0;
    v12 = (v10 | v11) - (v11 & v10);
    v13 = v12 + ~v12 * 2;
    v14 = v13 + 1;
    v15 = v13 + 2;
    v16 = v12 - v10 + (v15 + (v10 | ~v14)) * 2;
    v17 = (v12 ^ -v11) + ((v12 & -v11) + v15 + (v11 | ~v14)) * 2;
    v18 = (~v17 - (v16 | ~v17) ^ (v17 | v16)) + (~v17 - (v16 | ~v17) & (v17 | v16)) * 2;
    v19 = v18 + (v16 ^ v17) + ((v16 ^ v17) + (-v18 | ~(v16 ^ v17)) + (-v18 & ~(v16 ^ v17))) * 2 + 2;
    while (1)
    {
        v20 = (unsigned int)v1;
        v21 = (unsigned int)v0;
        v22 = v21 + ~v21 * 2 + 1;
        v23 = v21 - v20 + (v22 + (v20 | ~v22)) * 2 + 2;
        v24 = (v20 ^ -v21) + (v21 & ~v20) * 2 + v23 + ((v20 & -v21) + ~v23) * 2;
        *(unsigned int *)&v0 = v24 + 9;
        *(unsigned int *)&v1 = v24 + 439;
        if (~(((unsigned int)v1 + 1 ^ (unsigned int)v0) + ((unsigned int)v1 + 1 & (unsigned int)v0) * 2) + (((unsigned int)v1 + 1 ^ (unsigned int)v0) + ((unsigned int)v1 + 1 & (unsigned int)v0) * 2) * 2 <= v19)
            break;
        v26 = g_d20cb8[v19];
        i = (&g_d21a98.field_0)[v19];
        v28 = a0 + g_d20cb8[v19];
        v29 = v1;
        v30 = v0;
        v31 = (&(~v29)[-1 * (v30 | ~v29)] ^ (v30 | v29)) + (&(~v29)[-1 * (v30 | ~v29)] & (v30 | v29)) * 2;
        v32 = v31 - v29 + 2 * (v31 + ~v31 * 2 + 1 & v29);
        v33 = v31 | v30;
        v34 = (v30 | ~v31) + v31;
        v35 = v33 + ~v34;
        v36 = v32 - (v35 + (v32 & v34 - v33) * 2);
        v37 = (v36 ^ v32 ^ v35) + ((v32 ^ v35) + (v36 | ~(v32 ^ v35))) * 2 + 2;
        if (i > v37)
        {
            do
            {
                v38 = (&g_d1f230)[v37 + v26];
                v3 = 0;
                v4 = 0;
                v6 = 0;
                v5 = 0;
                v3 = (unsigned int)(9.1505032e-316 >> 0);
                j = 0;
                if (28 >= j)
                {
                    do
                    {
                        v39 = *((char *)&v3 + j);
                        v40 = (unsigned int)j + (4241847042 | ~(unsigned int)j) + ((unsigned int)j | 4241847042) + 1;
                        v41 = ((v40 | v39 + ~v39 * 2 + 1) & ~(v39 + ~v39 * 2)) * 4 + (v39 + ~v39 * 2 ^ ~(v40 | v39 + ~v39 * 2 + 1)) * 2;
                        *((char *)&v3 + j) = v41 + v40 + v39 + (v40 + v39 + (-v41 | ~(v40 + v39)) + ((char)-v41 & (char)~(v40 + v39))) * 2 - 12;
                        j += 1;
                    } while (j < 29);
                }
                v42 = ((char)v3 * (char)v37 & 135) + (char)v3 * (char)v37 + ((char)v3 * (char)v37 & 135 ^ 135);
                v28[v37] = (char)(v38 + 1 - v42) + ((char)v38 + 1 + (char)~v38 * 2 + (v42 | (char)~(v38 + 1 + ~v38 * 2))) * 2 + 1;
                v43 = v0;
                v44 = ((v43 | 95) ^ -(v43 & 95)) + ((v43 | 95) & -(v43 & 95)) * 2;
                v45 = (v44 | v43) + ~((v43 | ~v44) + v44);
                v46 = (((0xffffffff ^ (unsigned int)v45 * 2) & 2) + v45 - 1 | v45 & 1) + (v45 - 1 & v45 & 1);
                v47 = ((~v46 | 1) ^ v46 + 1) + ((~v46 | 1) & v46 + 1) * 2 + 1;
                v37 = ~((v47 ^ v37) + (v47 & v37) * 2) + ((v47 ^ v37) + (v47 & v37) * 2) * 2;
            } while (i > v37);
        }
        v48 = (char)v1;
        v49 = (char)v0;
        v50 = v48 + ~v48 * 2 + 1;
        v51 = -v49;
        v52 = (v48 ^ v51) + (v50 + (v48 & v51) + (v49 | ~v50)) * 2 + 2;
        v53 = (v52 ^ -v48) + ((v52 & -v48) + (v52 + ~v52 * 2 + 1 & v48)) * 2;
        v54 = (v52 ^ v51) + (v49 & ~v52) * 2 + (v52 & v51) * 2;
        v55 = ~v53 - (v54 | ~v53);
        v56 = v54 - v53 + (v53 & ~v54) * 2;
        v28[i] = (((char)v53 | (char)v54) ^ (char)(~v53 - (v54 | ~v53))) + (((char)v53 | (char)v54) & (char)(~v53 - (v54 | ~v53))) * 2 + (char)v56 + ((char)-v56 & (char)~(((v53 | v54) ^ ~v53 - (v54 | ~v53)) + ((v53 | v54) & v55) * 2)) * 2 + (char)(((v53 | v54) ^ ~v53 - (v54 | ~v53)) + ((v53 | v54) & v55) * 2 - v56 - (((v53 | v54) ^ ~v53 - (v54 | ~v53)) + ((v53 | v54) & v55) * 2 | -v56)) * 2;
        v57 = (unsigned int)v0;
        v58 = v57 + (~v57 | 0xfffffffc) + 4;
        v59 = (v58 ^ -(v57 & 3)) + (v58 & -(v57 & 3)) * 2;
        v60 = ((v59 | v57) ^ -(v59 & v57)) + ((v59 | v57) & -(v59 & v57)) * 2 + ((v59 | v57) ^ ~-(v59 & v57) | 0xfffffffe);
        v61 = (unsigned int)(0xfffffffd - v60) | 1;
        v62 = (v61 ^ v60 + 3) + (v61 & v60 + 3) * 2 + 1;
        v19 = (v62 ^ v19) + (v62 & v19) * 2 - 1;
    }
    if (*(long long *)&g_10002b0 == v7)
        return;
    ___stack_chk_fail();
}
