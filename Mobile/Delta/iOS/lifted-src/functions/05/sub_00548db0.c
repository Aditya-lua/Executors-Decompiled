/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x548db0..0x549a30 (3200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_548db0_0 {
    char field_0;
} st_548db0_0;

extern unsigned long long g_e82680;
extern unsigned long long g_e82688;
extern unsigned long long g_e82690;
extern unsigned long long g_e82698;
extern unsigned long long g_e826d8;

void sub_548db0(long long a0, st_548db0_0 **a1)
{
    unsigned long long v16;  // x26
    unsigned long long v17;  // x25
    char *v26;  // x9
    unsigned long long v27;  // w21
    st_548db0_0 *v28;  // x10
    st_548db0_0 **v29;  // x11
    st_548db0_0 **v30;  // x12
    unsigned long v31;  // x14
    unsigned long long v32;  // x12
    unsigned long long v33;  // x13
    unsigned long long v34;  // x15
    unsigned long long v35;  // x10
    unsigned long long v18;  // x24
    unsigned long long v36;  // x16
    unsigned long long v37;  // x13
    unsigned long long v38;  // x11
    unsigned long long v39;  // x12
    unsigned long long v40;  // x10
    unsigned long long v41;  // x10
    unsigned long long v42;  // x10
    unsigned long long v43;  // x11
    unsigned long long v44;  // x12
    unsigned long long v45;  // x11
    unsigned long long v19;  // x23
    unsigned long long v46;  // x10
    unsigned long long i;  // x10
    st_548db0_0 **v48;  // x15
    unsigned long long v49;  // x16
    unsigned long long v50;  // x15
    unsigned long v51;  // x16
    unsigned long long v52;  // x15
    unsigned long long v53;  // x15
    st_548db0_0 *v54;  // x10
    st_548db0_0 **v55;  // x11
    unsigned long long v20;  // x22
    st_548db0_0 **v56;  // x12
    unsigned long v57;  // x14
    unsigned long long v58;  // x12
    unsigned long long v59;  // x13
    unsigned long long v60;  // x15
    unsigned long long v61;  // x10
    unsigned long long v62;  // x16
    unsigned long long v63;  // x13
    unsigned long long v64;  // x11
    unsigned long long v65;  // x12
    unsigned long long v21;  // x21
    unsigned long long v66;  // x10
    unsigned long long v67;  // x10
    unsigned long long v68;  // x10
    unsigned long long v69;  // x11
    unsigned long long v70;  // x12
    unsigned long long v71;  // x11
    unsigned long long v72;  // x10
    unsigned long long j;  // x10
    st_548db0_0 **v74;  // x15
    unsigned long long v75;  // x16
    unsigned long long v22;  // x20
    unsigned long long v76;  // x15
    unsigned long v77;  // x16
    unsigned long long v78;  // x15
    unsigned long long v79;  // x15
    unsigned long long v80;  // x8
    unsigned long long v81;  // x9
    unsigned long long v23;  // x19
    unsigned long long v24;  // x30
    char *v25;  // x8
    st_548db0_0 **v0;  // [bp-0x88], Other Possible Types: char
    st_548db0_0 *v1;  // [bp-0x80]
    st_548db0_0 *v2;  // [bp-0x78]
    char v3;  // [bp-0x60]
    st_548db0_0 **v4;  // [bp-0x58], Other Possible Types: char
    unsigned long long v5;  // [bp-0x50]
    unsigned long long v6;  // [bp-0x48]
    unsigned long long v7;  // [bp-0x40]
    unsigned long long v8;  // [bp-0x38]
    unsigned long long v9;  // [bp-0x30]
    unsigned long long v10;  // [bp-0x28]
    unsigned long long v11;  // [bp-0x20]
    unsigned long long v12;  // [bp-0x18]
    char *v13;  // [bp-0x10]
    unsigned long long v14;  // [bp-0x8]
    char v15;  // [bp+0x0]

    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = v19;
    v9 = v20;
    v10 = v21;
    v11 = v22;
    v12 = v23;
    v13 = &v15;
    v14 = v24;
    v1 = &v0;
    v0 = &v1;
    v25 = *a1;
    if (a1[1] > v25)
    {
        v26 = v25 + 1;
        *a1 = v26;
        v27 = *v25;
        if (v27 > 1)
        {
            if (2 > v27 - 2)
            {
                v2 = &v4;
                v4 = &v2;
                v28 = v2;
                v29 = v4;
                v30 = -v29;
                v31 = v28 ^ v30;
                v32 = v31 + (v29 & ~v28) * 4 - (v29 & ~v28) * 2 + (v28 - ((char *)v29 + (v28 | v30))) * 2;
                v33 = ~v32;
                v34 = (v33 & ~v28) + (v28 | v32) * 2 + 2;
                v35 = v32 & v28;
                v36 = v34 + ~v35;
                v37 = (v32 ^ 1) + ((v31 * 2 | v31 >> 63) & 2 & 3) + v33 * 2;
                v38 = (((v37 + (char *)v29 & ~(st_548db0_0 **)(v37 + (char *)v29 + (~v37 | ~v29))) * 4 + (v37 + (char *)v29 + (~v37 | ~v29) ^ ~(st_548db0_0 **)(v37 + (char *)v29)) * 2 | 1) ^ (char *)v29 + 0x2 * ~v29 + v32 + 2) + (((v37 + (char *)v29 & ~(st_548db0_0 **)(v37 + (char *)v29 + (~v37 | ~v29))) * 4 + (v37 + (char *)v29 + (~v37 | ~v29) ^ ~(st_548db0_0 **)(v37 + (char *)v29)) * 2 | 1) & (char *)v29 + 0x2 * ~v29 + v32 + 2) * 2;
                v39 = ~v38 + v38 * 2;
                v40 = (v36 ^ 1) + (v35 - v34) * 2 + ((v36 * 2 | v36 >> 63) & 2 & 3);
                v41 = ((v39 | ~v40) & v40 + 1) * 4 + ((v39 | ~v40) ^ v40 + 1) * 2 | 1;
                v42 = (v41 ^ v36 - v39) + (v41 & v36 - v39) * 2 - 1;
                v43 = v39 - v36 + (v36 & -v38) * 2 + (v39 & v36);
                v44 = -((v39 + v36 ^ -(v39 | v36)) + (v39 + v36 & -(v39 | v36)) * 2);
                v45 = (~v43 - (v44 | ~v43)) * 2 - (v44 ^ v43);
                v46 = ~((v45 ^ v42) + (v45 & v42) * 2) + ((v45 ^ v42) + (v45 & v42) * 2) * 2;
                i = ~((v46 * 2 & 4) + (v46 ^ 2)) + ((v46 * 2 & 4) + (v46 ^ 2)) * 2;
                if (3 >= i)
                {
                    do
                    {
                        (&v3)[i] = v26[i];
                        v48 = v4;
                        v49 = (v48 | 99) - ((char *)&v48[12] + 3 & -0x1 * v48 - (0xffffffffffffff9c | ~v48) + 0xffffffffffffff9c) * 2 + ((char *)v48 + (0xffffffffffffff9c | ~v48) + 99 ^ (char *)&v48[12] + 3) + 1;
                        v50 = (v49 & (char *)v48 + 0x2 * ~v48 + 1) + (char *)v48 - (v49 & v48);
                        v51 = v50 * 2 + ~v50 + (~((unsigned int)v50 * 2) & 2);
                        v52 = ((1 & ~v50) + (v50 ^ 0xfffffffffffffffe) ^ v50 + 1) + ((1 & ~v50) + (v50 ^ 0xfffffffffffffffe) & v50 + 1) * 2;
                        v53 = v51 + v52 + (v52 | ~v51) + (v51 & ~v52) + 1;
                        i = i - (v53 + (v53 | 1) - (v53 | 1) * 2 - 2) + (v53 + (v53 | 1) - (v53 | 1) * 2 + 2 & ~i) * 2 + (v53 + (v53 | 1) - (v53 | 1) * 2 - 2 & i) * 2 - 5;
                    } while (i < 4);
                }
                *a1 = v25 + 5;
                (g_e82698 - 0x3e380f00)();
            }
            else
            {
                if (v27 == 4)
                    sub_548db0(a0, a1); /* do not return */
            }
            goto LABEL_5499f4;
        }
        else if (v27)
        {
            if (v27 == 1)
            {
                v2 = &v4;
                v4 = &v2;
                v54 = v2;
                v55 = v4;
                v56 = -v55;
                v57 = v54 ^ v56;
                v58 = v57 + (v55 & ~v54) * 4 - (v55 & ~v54) * 2 + (v54 - v55 - (v54 | v56)) * 2;
                v59 = ~v58;
                v60 = (v59 & ~v54) + (v54 | v58) * 2 + 2;
                v61 = v58 & v54;
                v62 = v60 + ~v61;
                v63 = (v58 ^ 1) + ((v57 * 2 | v57 >> 63) & 2 & 3) + v59 * 2;
                v64 = (((v63 + (char *)v55 & ~(st_548db0_0 **)(v63 + (char *)v55 + (~v63 | ~v55))) * 4 + (v63 + (char *)v55 + (~v63 | ~v55) ^ ~(st_548db0_0 **)(v63 + (char *)v55)) * 2 | 1) ^ (char *)v55 + 0x2 * ~v55 + v58 + 2) + (((v63 + (char *)v55 & ~(st_548db0_0 **)(v63 + (char *)v55 + (~v63 | ~v55))) * 4 + (v63 + (char *)v55 + (~v63 | ~v55) ^ ~(st_548db0_0 **)(v63 + (char *)v55)) * 2 | 1) & (char *)v55 + 0x2 * ~v55 + v58 + 2) * 2;
                v65 = ~v64 + v64 * 2;
                v66 = (v62 ^ 1) + (v61 - v60) * 2 + ((v62 * 2 | v62 >> 63) & 2 & 3);
                v67 = ((v65 | ~v66) & v66 + 1) * 4 + ((v65 | ~v66) ^ v66 + 1) * 2 | 1;
                v68 = (v67 ^ v62 - v65) + (v67 & v62 - v65) * 2 - 1;
                v69 = v65 - v62 + (v62 & -v64) * 2 + (v65 & v62);
                v70 = -((v65 + v62 ^ -(v65 | v62)) + (v65 + v62 & -(v65 | v62)) * 2);
                v71 = (~v69 - (v70 | ~v69)) * 2 - (v70 ^ v69);
                v72 = ~((v71 ^ v68) + (v71 & v68) * 2) + ((v71 ^ v68) + (v71 & v68) * 2) * 2;
                j = ~((v72 * 2 & 4) + (v72 ^ 2)) + ((v72 * 2 & 4) + (v72 ^ 2)) * 2;
                if (3 >= j)
                {
                    do
                    {
                        (&v3)[j] = v26[j];
                        v74 = v4;
                        v75 = (v74 | 99) - ((char *)&v74[12] + 3 & -0x1 * v74 - (0xffffffffffffff9c | ~v74) + 0xffffffffffffff9c) * 2 + ((char *)v74 + (0xffffffffffffff9c | ~v74) + 99 ^ (char *)&v74[12] + 3) + 1;
                        v76 = (v75 & (char *)v74 + 0x2 * ~v74 + 1) + (char *)v74 - (v75 & v74);
                        v77 = v76 * 2 + ~v76 + (~((unsigned int)v76 * 2) & 2);
                        v78 = ((1 & ~v76) + (v76 ^ 0xfffffffffffffffe) ^ v76 + 1) + ((1 & ~v76) + (v76 ^ 0xfffffffffffffffe) & v76 + 1) * 2;
                        v79 = v77 + v78 + (v78 | ~v77) + (v77 & ~v78) + 1;
                        j = j - (v79 + (v79 | 1) - (v79 | 1) * 2 - 2) + (v79 + (v79 | 1) - (v79 | 1) * 2 + 2 & ~j) * 2 + (v79 + (v79 | 1) - (v79 | 1) * 2 - 2 & j) * 2 - 5;
                    } while (j < 4);
                }
                *a1 = v25 + 5;
                (g_e82690 - 0x43a6a000)();
            }
LABEL_5499f4:
            v80 = 0x686c1c00;
            v81 = g_e826d8;
        }
        else
        {
            v80 = 0x81f8d400;
            v81 = g_e82688;
        }
    }
    else
    {
        v80 = 0x884dad00;
        v81 = g_e82680;
    }
    (v81 - v80)();
}
