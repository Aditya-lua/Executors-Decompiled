/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xacc878..0xacca24 (428 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_df8858;
extern char g_df88d0;
extern char _NSHomeDirectory;

int sub_acc878(unsigned int *a0, unsigned int *a1)
{
    unsigned long v0;  // x8
    unsigned long v1;  // x9
    unsigned int *v10;  // x14
    unsigned int v11;  // w16
    unsigned long long v12;  // x17
    unsigned int v13;  // w17
    unsigned long long v14;  // x16
    unsigned int v15;  // w16
    unsigned int *v16;  // x14
    unsigned long long v17;  // x16
    unsigned int v18;  // w16
    unsigned long long v19;  // x16
    unsigned int v2;  // w8
    unsigned int v20;  // w16
    unsigned int v3;  // w9
    unsigned long v4;  // x10
    unsigned long v5;  // x11
    unsigned int v6;  // w10
    unsigned int v7;  // w11
    unsigned int *iter;  // x12
    unsigned long long i;  // x13

    v0 = *a0;
    v1 = a0[1];
    v2 = (unsigned int)((((((v0 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v0 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v0 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v0 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) ^ 2746333894;
    v3 = (unsigned int)((((((v1 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v1 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v1 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v1 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) ^ 1453994832;
    v4 = a0[2];
    v5 = a0[3];
    v6 = (unsigned int)((((((v4 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v4 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v4 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v4 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) ^ 1736282519;
    v7 = (unsigned int)((((((v5 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v5 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v5 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v5 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32) ^ 2993693404;
    iter = a1 + 2;
    i = 0xfffffffffffffffc;
    v10 = &g_df8858;
    do
    {
        v11 = v7 ^ v6;
        v12 = v11 ^ v3 ^ *(int *)((char *)v10 - 8);
        v13 = (&g_df88d0)[v12 >> 24] * &_NSHomeDirectory | (&g_df88d0)[(v12 * 0x1000000000000 | v12 >> 16) & 0xffff0000000000ff & 0xff] * 0x10000 | (&g_df88d0)[(v12 * 0x100000000000000 | v12 >> 8) & 0xff000000000000ff & 0xff] * 0x100 | (&g_df88d0)[v12 & 0xff];
        v2 = v2 ^ (v13 * 0x2000 | v13 >> 19) ^ (v13 * 0x800000 | v13 >> 9) ^ v13;
        v14 = v11 ^ *(int *)((char *)v10 - 4) ^ v2;
        v15 = (&g_df88d0)[v14 >> 24] * &_NSHomeDirectory | (&g_df88d0)[(v14 * 0x1000000000000 | v14 >> 16) & 0xffff0000000000ff & 0xff] * 0x10000 | (&g_df88d0)[(v14 * 0x100000000000000 | v14 >> 8) & 0xff000000000000ff & 0xff] * 0x100 | (&g_df88d0)[v14 & 0xff];
        v3 = (v15 * 0x2000 | v15 >> 19) ^ (v15 * 0x800000 | v15 >> 9) ^ v3 ^ v15;
        v16 = v10 + 4;
        v17 = v7 ^ *v10 ^ v2 ^ v3;
        v18 = (&g_df88d0)[v17 >> 24] * &_NSHomeDirectory | (&g_df88d0)[(v17 * 0x1000000000000 | v17 >> 16) & 0xffff0000000000ff & 0xff] * 0x10000 | (&g_df88d0)[(v17 * 0x100000000000000 | v17 >> 8) & 0xff000000000000ff & 0xff] * 0x100 | (&g_df88d0)[v17 & 0xff];
        v6 = (v18 * 0x2000 | v18 >> 19) ^ (v18 * 0x800000 | v18 >> 9) ^ v6 ^ v18;
        v19 = v2 ^ v10[1] ^ v3 ^ v6;
        v20 = (&g_df88d0)[v19 >> 24] * &_NSHomeDirectory | (&g_df88d0)[(v19 * 0x1000000000000 | v19 >> 16) & 0xffff0000000000ff & 0xff] * 0x10000 | (&g_df88d0)[(v19 * 0x100000000000000 | v19 >> 8) & 0xff000000000000ff & 0xff] * 0x100 | (&g_df88d0)[v19 & 0xff];
        v7 = (v20 * 0x2000 | v20 >> 19) ^ (v20 * 0x800000 | v20 >> 9) ^ v7 ^ v20;
        *(unsigned int *)((char *)iter - 8) = v2;
        *(unsigned int *)((char *)iter - 4) = v3;
        *iter = v6;
        iter[1] = v7;
        iter += 4;
        i += 4;
        v10 = v16;
    } while (i < 28);
    return 1;
}
