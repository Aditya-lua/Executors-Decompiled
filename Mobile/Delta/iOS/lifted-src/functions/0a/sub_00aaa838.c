/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaaa838..0xaaabf4 (956 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char * sub_aaa838(char *a0, unsigned long long a1, char *a2, char *iter)
{
    unsigned int node;  // w8
    unsigned long v1;  // x11
    unsigned long v10;  // x12
    unsigned long v11;  // x13
    unsigned long long v12;  // x11
    unsigned long long v13;  // x14
    char v14;  // x15
    unsigned long v15;  // x12
    unsigned long v16;  // x13
    unsigned long long v17;  // x11
    unsigned long long v18;  // x14
    char v19;  // x15
    char *v2;  // x9
    unsigned long v20;  // x12
    unsigned long v21;  // x13
    unsigned long long v22;  // x11
    unsigned long long v23;  // x14
    char v24;  // x15
    unsigned long v25;  // x12
    unsigned long v26;  // x13
    unsigned long long v27;  // x11
    unsigned long long v28;  // x14
    char v29;  // x15
    unsigned long long i;  // x10
    unsigned long v30;  // x12
    unsigned long v31;  // x13
    unsigned long long v32;  // x11
    unsigned long long v33;  // x14
    char v34;  // x15
    unsigned long v35;  // x12
    unsigned long v36;  // x13
    unsigned long long v37;  // x11
    unsigned long long v38;  // x14
    char v39;  // x15
    unsigned long long v4;  // x10
    unsigned long v40;  // x12
    unsigned long v41;  // x13
    unsigned long long v42;  // x14
    char v43;  // x15
    unsigned long long v44;  // x10
    unsigned int v45;  // w12
    unsigned long v46;  // x13
    unsigned long v47;  // x14
    unsigned long long v48;  // x15
    char v49;  // x16
    unsigned long v5;  // x12
    unsigned long v50;  // x13
    unsigned long v51;  // x14
    unsigned long long v52;  // x15
    char v53;  // x16
    unsigned long v54;  // x13
    unsigned long v55;  // x14
    unsigned long long v56;  // x15
    char v57;  // x16
    unsigned long v58;  // x13
    unsigned long v59;  // x14
    unsigned long v6;  // x13
    unsigned long long v60;  // x15
    char v61;  // x16
    unsigned long v62;  // x13
    unsigned long v63;  // x14
    unsigned long long v64;  // x15
    char v65;  // x16
    unsigned long v66;  // x13
    unsigned long v67;  // x14
    unsigned long long v68;  // x15
    char v69;  // x16
    unsigned long long v7;  // x11
    unsigned long v70;  // x10
    unsigned long v71;  // x12
    unsigned long long v72;  // x13
    char v73;  // x14
    unsigned long long v8;  // x14
    char v9;  // x15

    node = *a0;
    v1 = a0[1];
    v2 = a0 + 2;
    if (a1 >= 8)
    {
        i = a1 >> 3;
        do
        {
            v4 = i;
            v5 = node + 1 & 0xff;
            v6 = v2[v5];
            v7 = v6 + v1;
            v8 = v7 & 0xff;
            v9 = v2[v8];
            v2[v5] = v9;
            v2[v8] = v6;
            *iter = *a2 ^ v2[v9 + v6 & 0xff];
            v10 = node + 2 & 0xff;
            v11 = v2[v10];
            v12 = v11 + v7;
            v13 = v12 & 0xff;
            v14 = v2[v13];
            v2[v10] = v14;
            v2[v13] = v11;
            iter[1] = a2[1] ^ v2[v14 + v11 & 0xff];
            v15 = node + 3 & 0xff;
            v16 = v2[v15];
            v17 = v16 + v12;
            v18 = v17 & 0xff;
            v19 = v2[v18];
            v2[v15] = v19;
            v2[v18] = v16;
            iter[2] = a2[2] ^ v2[v19 + v16 & 0xff];
            v20 = node + 4 & 0xff;
            v21 = v2[v20];
            v22 = v21 + v17;
            v23 = v22 & 0xff;
            v24 = v2[v23];
            v2[v20] = v24;
            v2[v23] = v21;
            iter[3] = a2[3] ^ v2[v24 + v21 & 0xff];
            v25 = node + 5 & 0xff;
            v26 = v2[v25];
            v27 = v26 + v22;
            v28 = v27 & 0xff;
            v29 = v2[v28];
            v2[v25] = v29;
            v2[v28] = v26;
            iter[4] = a2[4] ^ v2[v29 + v26 & 0xff];
            v30 = node + 6 & 0xff;
            v31 = v2[v30];
            v32 = v31 + v27;
            v33 = v32 & 0xff;
            v34 = v2[v33];
            v2[v30] = v34;
            v2[v33] = v31;
            iter[5] = a2[5] ^ v2[v34 + v31 & 0xff];
            v35 = node + 7 & 0xff;
            v36 = v2[v35];
            v37 = v36 + v32;
            v38 = v37 & 0xff;
            v39 = v2[v38];
            v2[v35] = v39;
            v2[v38] = v36;
            iter[6] = a2[6] ^ v2[v39 + v36 & 0xff];
            node += 8;
            v40 = node & 0xff;
            v41 = v2[v40];
            v1 = v41 + v37;
            v42 = v1 & 0xff;
            v43 = v2[v42];
            v2[v40] = v43;
            v2[v42] = v41;
            iter[7] = a2[7] ^ v2[v43 + v41 & 0xff];
            a2 += 8;
            iter += 8;
            i = v4 - 1;
        } while (i);
    }
    v44 = a1 & 7;
    if (a1 & 7)
    {
        v45 = node + 1;
        v46 = v45 & 0xff;
        v47 = v2[v46];
        v1 += v47;
        v48 = v1 & 0xff;
        v49 = v2[v48];
        v2[v46] = v49;
        v2[v48] = v47;
        *iter = *a2 ^ v2[v49 + v47 & 0xff];
        if (v44 != 1)
        {
            v45 = node + 2;
            v50 = v45 & 0xff;
            v51 = v2[v50];
            v1 += v51;
            v52 = v1 & 0xff;
            v53 = v2[v52];
            v2[v50] = v53;
            v2[v52] = v51;
            iter[1] = a2[1] ^ v2[v53 + v51 & 0xff];
            if (v44 == 2)
                goto LABEL_aaaba8;
            v45 = node + 3;
            v54 = v45 & 0xff;
            v55 = v2[v54];
            v1 += v55;
            v56 = v1 & 0xff;
            v57 = v2[v56];
            v2[v54] = v57;
            v2[v56] = v55;
            iter[2] = a2[2] ^ v2[v57 + v55 & 0xff];
            if (v44 == 3)
                goto LABEL_aaaba8;
            v45 = node + 4;
            v58 = v45 & 0xff;
            v59 = v2[v58];
            v1 += v59;
            v60 = v1 & 0xff;
            v61 = v2[v60];
            v2[v58] = v61;
            v2[v60] = v59;
            iter[3] = a2[3] ^ v2[v61 + v59 & 0xff];
            if (v44 == 4)
                goto LABEL_aaaba8;
            v45 = node + 5;
            v62 = v45 & 0xff;
            v63 = v2[v62];
            v1 += v63;
            v64 = v1 & 0xff;
            v65 = v2[v64];
            v2[v62] = v65;
            v2[v64] = v63;
            iter[4] = a2[4] ^ v2[v65 + v63 & 0xff];
            if (v44 == 5)
                goto LABEL_aaaba8;
            v45 = node + 6;
            v66 = v45 & 0xff;
            v67 = v2[v66];
            v1 += v67;
            v68 = v1 & 0xff;
            v69 = v2[v68];
            v2[v66] = v69;
            v2[v68] = v67;
            iter[5] = a2[5] ^ v2[v69 + v67 & 0xff];
            if (v44 == 6)
                goto LABEL_aaaba8;
            node += 7;
            v70 = node & 0xff;
            v71 = v2[v70];
            v1 += v71;
            v72 = v1 & 0xff;
            v73 = v2[v72];
            v2[v70] = v73;
            v2[v72] = v71;
            iter[6] = a2[6] ^ v2[v73 + v71 & 0xff];
        }
        else
        {
LABEL_aaaba8:
            node = v45;
        }
    }
    *a0 = node;
    a0[1] = v1;
    return a0;
}
