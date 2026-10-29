/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x795b0..0x79738 (392 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

void* sub_795b0(void* a0, char *a1, unsigned long long a2, unsigned int a3, unsigned long long a4)
{
    unsigned long long i;  // x8
    char *v12;  // x9
    void* v21;  // x0
    void* iter;  // x0
    unsigned long m;  // x22
    unsigned long long v24;  // x8
    char *v25;  // x9
    unsigned long long k;  // x10
    unsigned long long v27;  // x10
    unsigned long idx;  // x12
    unsigned long v29;  // x14
    char *v30;  // x9
    unsigned long long v13;  // x8
    char *v32;  // x9
    unsigned long long l;  // x8
    unsigned long long v34;  // x8
    char *v35;  // x9
    unsigned long v37;  // x22
    unsigned long idx1;  // x8
    void* v39;  // x0
    unsigned long index;  // x11
    unsigned long long v16;  // w8
    unsigned long long v17;  // x11
    unsigned long long idx2;  // x11
    unsigned int v19;  // w12
    unsigned long long v0;  // [bp-0x88]
    unsigned long long v1;  // [bp-0x80]
    unsigned long long v2;  // [bp-0x78]
    unsigned long long v3;  // [bp-0x70]
    unsigned long long v4;  // [bp-0x68]
    unsigned long long v5;  // [bp-0x60]
    unsigned long long v6;  // [bp-0x58]
    unsigned long long v7;  // [bp-0x50]
    unsigned long v8;  // [bp-0x48]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v8 = *(long long *)&g_10002b0;
    v4 = 0;
    v5 = 0;
    v7 = 0;
    v6 = 0;
    v0 = 0;
    v1 = 0;
    v3 = 0;
    v2 = 0;
    if (!(a2 >> 31 & 1))
    {
        i = (unsigned int)a2 + 1;
        v12 = a1 + 7;
        do
        {
            v13 = i;
            index = *v12;
            v12 += 8;
            *(short *)((char *)&v4 + 2 * index) = *(short *)((char *)&v4 + 2 * index) + 1;
            i = v13 - 1;
        } while (i);
    }
    if (a4 >= 1)
    {
        v16 = 0;
        v17 = a4;
        do
        {
            idx2 = v17;
            *(unsigned short *)((char *)&v0 + 2 * idx2) = v16;
            v19 = *(short *)((char *)&v4 + 2 * idx2);
            v16 = ((v19 + v16) * 0x80000000 | v19 + v16 >> 1) & 0x80007fff & 0x7fff;
            v17 = idx2 - 1;
        } while (1 < idx2);
    }
    v21 = a0;
    if (0x7ffffffe >= a3)
    {
        iter = a0 + 8;
        m = a3 + 1;
        if (1 >= (unsigned int)m)
        {
            v24 = 0;
        }
        else
        {
            v24 = m & 0x7ffffffe;
            v25 = a1 + 15;
            k = v24;
            do
            {
                v27 = k;
                idx = *(v25 - 1);
                v29 = *v25;
                v30 = v25 + 16;
                *(unsigned long long *)((char *)iter + 8 * *(v25 - 9)) = *(v25 - 8);
                *(unsigned long *)((char *)iter + 8 * idx) = v29;
                v25 = v30;
                k = v27 - 2;
            } while (k);
            if (v24 == m)
                goto LABEL_796cc;
        }
        v32 = &a1[8 * v24 + 7];
        l = m - v24;
        do
        {
            v34 = l;
            v35 = v32 + 8;
            *(unsigned long long *)((char *)iter + 8 * *(v32 - 1)) = *v32;
            l = v34 - 1;
            v32 = v35;
        } while (l);
LABEL_796cc:
        do
        {
            v37 = m;
            idx1 = *(char *)iter;
            iter += 8;
            *(short *)((char *)&v0 + 2 * idx1) = *(short *)((char *)&v0 + 2 * idx1) + 1;
            sub_79590();
            v21 = iter;
            m = v37 - 1;
        } while (m);
    }
    v39 = v21;
    *(char *)a0 = a4;
    *(char *)&a0[1] = a3;
    *(unsigned int *)&a0[2] = 0;
    *(unsigned short *)&a0[6] = 0;
    if (*(long long *)&g_10002b0 == v8)
        return v39;
    ___stack_chk_fail();
}
